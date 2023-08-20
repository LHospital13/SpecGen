import string

from util.chatgpt_wrapper import create_chatgpt_config
from util.prompt_format import FORMAT_REFINEMENT_PROMPT
from util.util import file2str

def gen_extra_guidance(err_info):
    if err_info.find('visibility') != -1:
        return "To avoid errors related to visibility, you can add \"spec_public\" specifications to the member variables within the class."
    elif err_info.find('non-pure') != -1:
        return "To avoid errors related to non-pure methods, you can add \"pure\" specifications to the methods that doesn't modify any class members."
    elif err_info.find('NegativeIndex') != -1:
        return "In case of \"PossiblyNegativeIndex\", you can add \"assume\" specifications to ensure that the index is either equal to 0 or greater than 0."
    elif err_info.find('TooLargeIndex') != -1:
        return "In case of \"PossiblyTooLargeIndex\", you can add \"assume\" specifications to ensure that the index is less than the length of the array."
    elif err_info.find('ArithmeticOperationRange') != -1 and err_info.find('negation') != -1:
        return "To avoid integer overflow in integer negation operation, you can add \"assume\" specification BEFORE the related code, in order to ensure that the operand is greater than the minimal value that can be expressed."
    elif err_info.find('overflow') != -1:
        return "To avoid integer overflow in arithmetic operation, you can add \"assume\" specification to guarantee that the operation result is within expressable range (smaller than maximum value and bigger than minimum value)."
    elif err_info.find('underflow') != -1:
        return "To avoid integer underflow in arithmetic operation, you can add \"assume\" specification to guarantee that the operation result is within expressable range (smaller than maximum value and bigger than minimum value)."
    elif err_info.find('LoopInvariantBeforeLoop') != -1:
        return "The \"LoopInvariantBeforeLoop\" error indicates that the loop invariant you stated may be violated before entering the loop. You should consider modifying corresponding \"loop_invariant\" or \"maintaining\" specifications."
    else:
        return ""

def read_refine_as_msg(dirname):
    dirpath = "./prompts/refine/" + dirname + "/"
    original_code = file2str(dirpath + "original")
    err_info = file2str(dirpath + "err_info")
    refined_code = file2str(dirpath + "refined")
    msg_request = {
        'role': 'user',
        'content': FORMAT_REFINEMENT_PROMPT.format(code=original_code, info=err_info)
    }
    msg_reply = {
        'role': 'assistant',
        'content': '```\n{code}\n```'.format(code=refined_code)
    }
    msg_request['content'] += gen_extra_guidance(err_info)
    return [msg_request, msg_reply]

def extract_err_type(err_info):
    prompt_list = []
    keyword_dict = {
        "visibility": "private_visibility",
        "NegativeIndex": "negative_index",
        "TooLargeIndex": "too_large_index",
        "ArithmeticOperationRange negation": "overflow_negation",
        "overflow sum": "overflow_sum",
        "overflow difference": "overflow_sub",
        "overflow multiply": "overflow_mul",
        "overflow divide": "overflow_div",
        "underflow sum": "underflow_sum",
        "underflow difference": "underflow_sub",
        "underflow multiply": "underflow_mul",
        "underflow divide": "underflow_div",
    }
    for key in keyword_dict:
        keyword_list = key.split(' ')
        flag_all_in = True
        for keyword in keyword_list:
            if err_info.find(keyword) == -1:
                flag_all_in = False
                break
        if flag_all_in:
            prompt_list.append(keyword_dict[key])
    return prompt_list

def create_specialized_patcher_prompt_config(original_code, err_info):
    msg_base = {
        'role': 'system',
        'content': 'You are an JML specification generator for java programs.'
    }
    messages = [msg_base]

    prompt_list = extract_err_type(err_info)
    for dirname in prompt_list:
        messages.extend(read_refine_as_msg(dirname))

    msg_request = {
        'role': 'user',
        'content': FORMAT_REFINEMENT_PROMPT.format(code=original_code, info=err_info)
    }
    msg_request['content'] += gen_extra_guidance(err_info)
    messages.append(msg_request)
    return create_chatgpt_config(messages)