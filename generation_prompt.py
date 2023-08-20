import random

from util.chatgpt_wrapper import create_chatgpt_config
from util.prompt_format import FORMAT_GENERATION_PROMPT
from util.util import file2str

def read_oracle_as_msg(classname):
    filename_oracle = "./prompts/oracle/" + classname + "/" + classname + ".java"
    filename_clean = "./prompts/oracle_clean/" + classname + "/" + classname + ".java"
    msg_request = {
        'role': 'user',
        'content': FORMAT_GENERATION_PROMPT.format(src_code=file2str(filename_clean))
    }
    msg_reply = {
        'role': 'assistant',
        'content': '```\n{code}\n```'.format(code=file2str(filename_oracle))
    }
    return [msg_request, msg_reply]

def randomly_select_prompt(oracle_list, num, class_name):
    selected_list = random.sample(oracle_list, num)
    while(class_name in selected_list):
        selected_list.remove(class_name)
        selected_list.append(random.choice(oracle_list))
    return selected_list

def manually_select_prompt():
    return ["Neg", "BinarySearch", "BubbleSort", "Calculator", "CopyArray"]

def create_generation_prompt_config(input_code, class_name):
    msg_base = {
        'role': 'system',
        'content': 'You are an JML specification generator for java programs.'
    }
    messages = [msg_base]

    oracle_list = ["Absolute", "AddLoop", "BinarySearch", "BubbleSort", "Calculator",
                   "CombinationPermutation", "CopyArray", "Factorial", "Fibonacci",
                   "FIND_FIRST_IN_SORTED", "FindFirstZero", "FindInArray", "FIND_IN_SORTED", "GCD",
                   "Inverse", "LCM", "LeapYear", "LinearSearch", "OddEven", "Perimeter",
                   "PrimeCheck", "PrimeNumbers", "SetZero", "Smallest", "StrPalindrome", "TransposeMatrix"]
    
    prompt_list = randomly_select_prompt(oracle_list, 4, class_name)
    # prompt_list = manually_select_prompt()
    for prompted_oracle in prompt_list:
        messages.extend(read_oracle_as_msg(prompted_oracle))

    msg_request = {
        'role': 'user',
        'content': FORMAT_GENERATION_PROMPT.format(src_code=input_code)
    }
    messages.append(msg_request)
    return create_chatgpt_config(messages)