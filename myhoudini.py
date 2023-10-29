import argparse
import os
import time

def str2file(str_content, filename):
    with open(filename, "w") as f:
        f.write(str_content)

def file2str(filename):
    res = ""
    with open(filename, "r") as f:
        for line in f.readlines():
            res = res + line
    return res

def extract_blank_prefix(string):
    string_stripped = string.strip()
    if len(string_stripped) > 0:
        return string.split(string_stripped)[0]
    else:
        return string
    
def validate_openjml(code_with_spec, classname):
    tmp_filename = os.path.abspath(".") + "/tmp/{filename}.java".format(filename=classname)
    tmp_file = open(tmp_filename, 'w')
    tmp_file.write(code_with_spec)
    tmp_file.close()
    cmd = os.path.abspath(".") + "/openjml/openjml --esc --esc-max-warnings 1 --arithmetic-failure=quiet --quiet " + tmp_filename
    res_lines = os.popen(cmd).readlines()
    res = ""
    for line in res_lines:
        res = res + line
    return res

def read_annotations_instr():
    annotations_path = os.path.abspath(".") + "/tmp/houdini_output/log/annotations.instr"
    if not os.access(annotations_path, os.R_OK):
        print("Error: Failed to generate candidate annotation set\n")
        return []
    res_list = []
    with open(annotations_path, "r") as f:
        for line in f.readlines():
            line = line.strip()
            tmp_list = line.split("'")
            content = tmp_list[1]
            for part in tmp_list[2:len(tmp_list)-1]:
                content = content + "'" + part
            tmp_list = tmp_list[0].split()
            lineno = int(tmp_list[-3])
            if content.find("Explicating default constructor") != -1 or content.find("*/final/*") != -1 or content.find("requires false;") != -1:
                continue
            tmp_dict = {
                "lineno": lineno, 
                "content": content
            }
            res_list.append(tmp_dict)
    return res_list

def gen_annotation(code, classname):
    tmp_filename = os.path.abspath(".") + "/tmp/{filename}.java".format(filename=classname)
    str2file(code, tmp_filename)
    outdir = os.path.abspath(".") + "/tmp/houdini_output"
    cmd = "./ESCTools2/Houdini/annotationGen -outdir " + outdir + " " + tmp_filename + " > ./tmp.log"
    print(cmd)
    os.system(cmd)

def merge_annotation_into_code(annotation_list, code):
    code_list = code.split('\n')
    res_code_list = []
    i, j = 0, 0
    while i < len(annotation_list) and j < len(code_list):
        if annotation_list[i]["lineno"] <= j + 1:
            res_code_list.append(
                {
                    "is_annotation": True,
                    "content": extract_blank_prefix(code_list[j]) + "//@ " + annotation_list[i]["content"]
                }                
            )
            i = i + 1
        else:
            res_code_list.append(
                {
                    "is_annotation": False,
                    "content": code_list[j]
                }                
            )
            j = j + 1
    while i < len(annotation_list):
        res_code_list.append(
            {
                "is_annotation": True,
                "content": extract_blank_prefix(code_list[j]) + annotation_list[i]["content"]
            }                
        )
        i = i + 1
    while j < len(code_list):
        res_code_list.append(
            {
                "is_annotation": False,
                "content": code_list[j]
            }                
        )
        j = j + 1
    return res_code_list

def extract_lineno_from_err_info(err_info):
    temp_list = []
    err_list = []
    err_info_list = err_info.split('\n')
    for line in err_info_list:
        if line.strip() == "^":
            err_list.append(temp_list)
            temp_list = []
        else:
            temp_list.append(line)
    lineno_list = []
    for err in err_list:
        lineno_list.append(int(err[0].split(":")[1]))
    return lineno_list

def myhoudini_algorithm(code, classname):
    current_time_str = time.strftime("%Y_%m_%d_%H_%M_%S", time.localtime(time.time()))
    f_log = open(os.path.abspath(".") + "/logs_myhoudini/log-{name}-{time_str}.txt".format(name=classname, time_str=current_time_str), "w")

    gen_annotation(code, classname)
    annotation_list = read_annotations_instr()
    merged_list = merge_annotation_into_code(annotation_list, code)
    err_info = "anything"
    merged_code = ""
    # Main loop of houdini algorithm
    while True:
        merged_code = ""
        for line in merged_list:
            merged_code = merged_code + line['content'] + '\n'
        print(merged_code)
        f_log.write(merged_code + "\n")
        err_info = validate_openjml(merged_code, classname)
        print(err_info)
        f_log.write(err_info + "\n")
        if err_info == "":
            break
        else:
            flag = False
            refuted_lineno_list = extract_lineno_from_err_info(err_info)
            for lineno in refuted_lineno_list:
                if merged_list[lineno - 1]["is_annotation"] == True:
                    merged_list.pop(lineno - 1)
                    flag = True
                    break
            if not flag:
                break
    return merged_code
    

def myhoudini_main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--input", type=str, default="")
    args = parser.parse_args()
    classname = args.input.split('/')[-1].split('.')[0]
    code = file2str(args.input)
    myhoudini_algorithm(code, classname)

if __name__ == "__main__":
    myhoudini_main()