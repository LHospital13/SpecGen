import argparse
import os
import openai
import time

from util.chatgpt_wrapper import request_chatgpt_engine, create_chatgpt_config
from util.prompt_format import FORMAT_INIT_PROMPT, FORMAT_REFINE_PROMPT
from util.util import file2str, parse_code_from_reply
from util.token_counter import count_config_token

from generation_prompt import create_generation_prompt_config
from refinement_prompt import create_specialized_patcher_prompt_config, gen_extra_guidance, extract_err_type
from myhoudini import extract_lineno_from_err_info, extract_blank_prefix

def token_limit_fitter(config, token_limit=4090):
    res = config
    while(count_config_token(res) > token_limit):
        res['messages'] = res['messages'][3:len(res['messages'])]
        res['messages'].insert(0, config['messages'][0])
    return res

def validate_openjml(code_with_spec, classname):
    tmp_filename = os.path.abspath(".") + "/tmp/{filename}.java".format(filename=classname)
    tmp_file = open(tmp_filename, 'w')
    tmp_file.write(code_with_spec)
    tmp_file.close()
    cmd = os.path.abspath(".") + "/openjml/openjml --esc --esc-max-warnings 1 --arithmetic-failure=quiet --nonnull-by-default --quiet -nowarn " + tmp_filename
    res_lines = os.popen(cmd).readlines()
    res = ""
    for line in res_lines:
        res = res + line
    return res

def mutate_token_list_random(token_list, has_forall, dont_mutate_logical):
    res_list = []
    token_variant_list = []
    if len(token_list) == 0:
        return [[""]]
    if token_list[0].find("\\forall") != -1 or token_list[0].find("\\exists") != -1:
        dont_mutate_logical = True
        tmp_str = token_list[0]
        token_variant_list.append(tmp_str.replace("forall", "exists"))
        token_variant_list.append(tmp_str.replace("exists", "forall"))
    elif token_list[0] == "&&" or token_list[0] == "||":
        if dont_mutate_logical:
            token_variant_list = [token_list[0]]
        else:
            token_variant_list = ["&&", "||"]
        if has_forall:
            dont_mutate_logical = False
    elif token_list[0] == "<=":
        token_variant_list = ["<", "<=", "- 1 <="]
    elif token_list[0] == ">=":
        token_variant_list = [">", ">=", "+ 1 >="]
    elif token_list[0] == "<":
        token_variant_list = ["<", "<="]
    elif token_list[0] == ">":
        token_variant_list = [">", ">="]
    elif not has_forall and (token_list[0] == "+" or token_list[0] == "-"):
        token_variant_list = ["+", "-"]
    else:
        token_variant_list = [token_list[0]]
    for variant in token_variant_list:
        for res in mutate_token_list_random(token_list[1:], has_forall, dont_mutate_logical):
            tmp_list = [variant]
            tmp_list.extend(res)
            res_list.append(tmp_list)
    return res_list

def spec_mutator_random(line):
    res_list = []
    has_forall = (line.find("forall") != -1 or line.find("exists") != -1)
    res_token_list_list = mutate_token_list_random(line.split(' '), has_forall, True)
    for token_list in res_token_list_list:
        tmp_str = ""
        for token in token_list:
            tmp_str = tmp_str + token + " "
        res_list.append(tmp_str)
    return res_list

def mutate_token_list_prior(token_list, current_index):
    res_list = []
    token_variant_list = []
    if current_index >= len(token_list):
        return [[""]]
    if token_list[current_index] == "<=":
        token_variant_list = ["<", "<=", "- 1 <="]
    elif token_list[current_index] == ">=":
        token_variant_list = [">", ">=", "+ 1 >="]
    elif token_list[current_index] == "<":
        token_variant_list = ["<", "<="]
    elif token_list[current_index] == ">":
        token_variant_list = [">", ">="]
    else:
        token_variant_list = [token_list[current_index]]
    for variant in token_variant_list:
        for res in mutate_token_list_prior(token_list, current_index + 1):
            tmp_list = [variant]
            tmp_list.extend(res)
            res_list.append(tmp_list)
    return res_list

def spec_mutator_heuristic(line):
    res_list = []
    has_forall = (line.find("forall") != -1 or line.find("exists") != -1)
    token_list = line.split(' ')
    res_token_list_list = mutate_token_list_prior(token_list, 0)
    for token_list in res_token_list_list:
        tmp_str = ""
        for token in token_list:
            tmp_str = tmp_str + token + " "
        res_list.append(tmp_str)

    res_list_random = spec_mutator_random(line)
    res_list_random_filtered = []
    for str1 in res_list_random:
        flag = False
        for str2 in res_list:
            if str1 == str2:
                flag = True
                break
        if not flag:
            res_list_random_filtered.append(str1)
    res_list.extend(res_list_random_filtered)
    return res_list
    

def is_invariant_or_postcondition(line):
    return line.find("@") != -1 and (line.find("invariant") != -1 or line.find("maintaining") != -1 or line.find("ensures") != -1 or line.find("decreases") != -1 or line.find("increases") != -1)

def config2str(config):
    res = ""
    for message in config["messages"]:
        res += "{role}: {content}\n".format(role=message['role'], content=message['content'])
    return res

def print_config(config):
    print(config2str(config))

def print_msg(message):
    print("{r}:{c}".format(r=message['role'], c=message['content']))

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--input", type=str, default="")
    parser.add_argument("--key_file", type=str, default="api_key.txt")
    parser.add_argument("--max_iterations", type=int, default=20)
    parser.add_argument("--verbose", action='store_true')
    args = parser.parse_args()

    if not os.access(args.input, os.R_OK):
        print("Cannot open input file {filename}".format(filename=args.input))
        exit(-1)
    classname = args.input.split('/')[-1].split('.')[0]

    openai.api_key = open(args.key_file, 'r').read().strip()
    input_code = file2str(args.input)
    current_code = input_code

    current_time_str = time.strftime("%Y_%m_%d_%H_%M_%S", time.localtime(time.time()))
    f_log = open(os.path.abspath(".") + "/logs/log-{name}-{time_str}.txt".format(name=classname, time_str=current_time_str), "w")

    num_verify = 0
    
    # Mutation Phase
    print("=============== Mutation Phase ===============")
    current_code_list = current_code.split('\n')
    mutated_spec_list = []
    # Generate mutated spec set
    for index in range(len(current_code_list)):
        if is_invariant_or_postcondition(current_code_list[index]):
            for mutated_spec in spec_mutator_heuristic(current_code_list[index]):
                mutated_spec_list.append({"content": mutated_spec, "index": index})
    while True:
        if err_info == "":
            break
        refuted_lineno_list = extract_lineno_from_err_info(err_info)
        # replace each error spec with mutated spec
        for lineno in refuted_lineno_list:
            index = lineno - 1
            if not is_invariant_or_postcondition(current_code_list[index]):
                continue
            # Find mutated spec with same lineno
            found_flag = False
            for item in mutated_spec_list:
                if item["index"] == index:
                    # replace error spec with mutated spec
                    current_code_list[index] = item['content']
                    mutated_spec_list.remove(item)
                    found_flag = True
                    break
            if not found_flag:
                current_code_list[index] = " "
        current_code = ""
        for line in current_code_list:
            current_code = current_code + line + "\n"
        print(current_code)
        f_log.write(current_code + "\n")
        err_info = validate_openjml(current_code, classname)
        num_verify = num_verify + 1
        print(err_info)
        f_log.write(err_info + "\n")

    print("\nFinished. Verifier invoked {num} times".format(num=num_verify))
    
    f_log.close()

if __name__ == "__main__":
    main()
