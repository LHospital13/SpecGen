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
from myhoudini import extract_lineno_from_err_info

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

def validate_openjml_reduction(code_with_spec, classname):
    tmp_filename = os.path.abspath(".") + "/tmp/{filename}.java".format(filename=classname)
    tmp_file = open(tmp_filename, 'w')
    tmp_file.write(code_with_spec)
    tmp_file.close()
    cmd = os.path.abspath(".") + "/openjml/openjml --esc --arithmetic-failure=quiet --nonnull-by-default --quiet -nowarn " + tmp_filename
    res_lines = os.popen(cmd).readlines()
    res = ""
    for line in res_lines:
        res = res + line
    return res

def mutate_token_list(token_list, in_forall):
    res_list = []
    token_variant_list = []
    if len(token_list) == 0:
        return [[""]]
    if token_list[0].find("\\forall") != -1 or token_list[0].find("\\exists") != -1:
        in_forall = True
        tmp_str = token_list[0]
        token_variant_list.append(tmp_str.replace("forall", "exists"))
        token_variant_list.append(tmp_str.replace("exists", "forall"))
    #elif token_list[0] == "==" or token_list[0] == "!=":
    #    token_variant_list = ["!=", "=="]
    elif token_list[0] == "&&" or token_list[0] == "||":
        if in_forall:
            in_forall = False
            token_variant_list = [token_list[0]]
        else:
            token_variant_list = ["&&", "||"]
    elif token_list[0] == "<=":
        token_variant_list = ["<=", "- 1 <="]
    elif token_list[0] == ">=":
        token_variant_list = [">=", "+ 1 >="]
    elif token_list[0] == "<":
        token_variant_list = ["<", "<="]
    elif token_list[0] == ">":
        token_variant_list = [">", ">="]
    #elif token_list[0] == "+" or token_list[0] == "-":
    #    token_variant_list = ["+", "-"]
    else:
        token_variant_list = [token_list[0]]
    for variant in token_variant_list:
        for res in mutate_token_list(token_list[1:], in_forall):
            tmp_list = [variant]
            tmp_list.extend(res)
            res_list.append(tmp_list)
    return res_list

def spec_mutator(line):
    res_list = []
    res_token_list_list = mutate_token_list(line.split(' '), False)
    for token_list in res_token_list_list:
        tmp_str = ""
        for token in token_list:
            tmp_str = tmp_str + token + " "
        res_list.append(tmp_str)
    return res_list

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

    current_time_str = time.strftime("%Y_%m_%d_%H_%M_%S", time.localtime(time.time()))
    f_log = open(os.path.abspath(".") + "/logs/log-{name}-{time_str}.txt".format(name=classname, time_str=current_time_str), "w")

    # Candidate Generation Phase
    print("=============== Generation Phase ===============")
    done_flag = False
    config = {}
    current_code = input_code
    err_info = ""
    err_types = []
    for i in range(1, args.max_iterations+1):
        print("--------------- Iteration {num} ---------------".format(num=i))
        if i == 1:
            config = create_generation_prompt_config(input_code, classname)
            print_config(config)
            ret = request_chatgpt_engine(config)
            print("assistant:", ret['choices'][0]['message']['content'])
            current_code = parse_code_from_reply(ret['choices'][0]['message']['content'])
            current_code = current_code.strip()
            config['messages'].append(
                {
                    'role': 'assistant',
                    'content': "```\n{code}\n```".format(code=current_code)
                }
            )
        else:
            err_types = extract_err_type(err_info)
            if len(err_types) != 0:
                tmp_config = create_specialized_patcher_prompt_config(current_code, err_info)
                print_config(tmp_config)
                ret = request_chatgpt_engine(tmp_config)
                print("assistant:", ret['choices'][0]['message']['content'])
                current_code = parse_code_from_reply(ret['choices'][0]['message']['content'])
                current_code = current_code.strip()
                config['messages'][-1]['content'] = "```\n{code}\n```".format(code=current_code)
            elif err_info.find("LoopInvariant") == -1 and err_info.find("Postcondition") == -1:
                refine_msg = {
                    'role': 'user',
                    'content': FORMAT_REFINE_PROMPT.format(err_info=err_info)
                }
                refine_msg['content'] += gen_extra_guidance(err_info)
                config['messages'].append(refine_msg)
                print_msg(refine_msg)
                token_limit_fitter(config, 3000)
                ret = request_chatgpt_engine(config)
                print("assistant:", ret['choices'][0]['message']['content'])
                current_code = parse_code_from_reply(ret['choices'][0]['message']['content'])
                current_code = current_code.strip()
                config['messages'].append(
                    {
                        'role': 'assistant',
                        'content': "```\n{code}\n```".format(code=current_code)
                    }
                )
            else:
                done_flag = True
                break
        f_log.write(current_code + "\n")
        err_info = validate_openjml(current_code, classname)
        print(err_info)
        err_types = extract_err_type(err_info)
        f_log.write(err_info + "\n")
        if err_info == "" or done_flag:
            break

    # Mutation Phase
    print("=============== Mutation of Invariants ===============")
    current_code_list = current_code.split('\n')
    mutated_spec_list = []
    for lineno in range(len(current_code_list)):
        if current_code_list[lineno].find("@") != -1 and (current_code_list[lineno].find("maintaining") != -1 or current_code_list[lineno].find("loop_invariant") != -1):
            for mutated_spec in spec_mutator(current_code_list[lineno]):
                mutated_spec_list.append({"content": mutated_spec, "lineno": lineno})
    for item in reversed(mutated_spec_list):
        current_code_list.insert(item["lineno"], item["content"])
    current_code = ""
    for line in current_code_list:
        current_code = current_code + line + "\n"
    print(current_code)

    # Reduction Phase
    print("=============== Reduction of Invariants ===============")
    err_info = "anything"
    while True:
        err_info = validate_openjml(current_code, classname)
        print(err_info)
        if err_info == "":
            break
        refuted_lineno_list = extract_lineno_from_err_info(err_info)
        new_code_list = []
        for index in range((len(current_code_list))):
            if index + 1 in refuted_lineno_list and current_code_list[index].find("@") != -1 and (current_code_list[lineno].find("maintaining") != -1 or current_code_list[lineno].find("loop_invariant") != -1):
                pass #deleted
            else:
                new_code_list.append(current_code_list[index])
                flag = True
        current_code_list = new_code_list
        current_code = ""
        for line in current_code_list:
            current_code = current_code + line + "\n"
        print(current_code)
        if not flag:
            break

    # Mutation Phase
    print("=============== Mutation of Postconditions ===============")
    current_code_list = current_code.split('\n')
    mutated_spec_list = []
    for lineno in range(len(current_code_list)):
        if current_code_list[lineno].find("@") != -1 and current_code_list[lineno].find("ensures") != -1:
            for mutated_spec in spec_mutator(current_code_list[lineno]):
                mutated_spec_list.append({"content": mutated_spec, "lineno": lineno})
    for item in reversed(mutated_spec_list):
        current_code_list.insert(item["lineno"], item["content"])
    current_code = ""
    for line in current_code_list:
        current_code = current_code + line + "\n"
    print(current_code)

    # Reduction Phase
    print("=============== Reduction of Postconditions ===============")
    err_info = "anything"
    while True:
        err_info = validate_openjml(current_code, classname)
        print(err_info)
        if err_info == "":
            break
        refuted_lineno_list = extract_lineno_from_err_info(err_info)
        new_code_list = []
        for index in range((len(current_code_list))):
            if index + 1 in refuted_lineno_list and current_code_list[index].find("@") != -1:
                pass
            else:
                new_code_list.append(current_code_list[index])
                flag = True
        current_code_list = new_code_list
        current_code = ""
        for line in current_code_list:
            current_code = current_code + line + "\n"
        print(current_code)
        if not flag:
            break
    
    f_log.close()

if __name__ == "__main__":
    main()