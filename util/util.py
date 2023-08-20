import os

def file2str(filename):
    res = ""
    with open(filename,"r") as f:
        for line in f.readlines():
            res = res + line
    return res

def parse_code_from_reply(content):
    # lines = content.split('\n')
    # res = ""
    # flag = False
    # for line in lines:
    #     if line.strip() == '```' and flag:
    #         break
    #     if flag:
    #         res = res + line + "\n"
    #     if line.strip() == '```' and not flag:
    #         flag = True
    content = 'a' + content
    extracted_str = content.split("```")[1]
    extracted_str = extracted_str if not extracted_str.startswith('java') else extracted_str[len('java'):]
    return extracted_str