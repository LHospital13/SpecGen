import argparse
import os
import openai
import subprocess

from util.chatgpt_wrapper import request_chatgpt_engine, create_chatgpt_config
from util.prompt_format import FORMAT_INIT_PROMPT, FORMAT_REFINE_PROMPT
from util.util import file2str, parse_code_from_reply

from generation_prompt import create_generation_prompt_config

def validate_openjml(code_with_spec, classname):
    tmp_filename = os.path.abspath(".") + "/tmp/{filename}.java".format(filename=classname)
    tmp_file = open(tmp_filename, 'w')
    tmp_file.write(code_with_spec)
    tmp_file.close()
    cmd = os.path.abspath(".") + "/openjml/openjml --esc " + tmp_filename
    res_lines = os.popen(cmd).readlines()
    res = ""
    for line in res_lines:
        res = res + line
    return res


def print_config(config):
    for message in config["messages"]:
        print("{role}: {content}\n".format(role=message['role'], content=message['content']))


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
    inputSrcCode = file2str(args.input)

    config = create_generation_prompt_config(inputSrcCode)
    print_config(config)

    ret = request_chatgpt_engine(config)
    print("assistant:", ret['choices'][0]['message']['content'])

    reply_code = parse_code_from_reply(ret['choices'][0]['message']['content'])
    err_info = validate_openjml(reply_code, classname)
    print(err_info)

if __name__ == "__main__":
    main()
