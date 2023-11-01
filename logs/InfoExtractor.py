import os
import re
from file_read_backwards import FileReadBackwards

def validate_openjml(code_with_spec, classname):
    tmp_filename = os.path.abspath("..") + "/tmp/{filename}.java".format(filename=classname)
    tmp_file = open(tmp_filename, 'w')
    tmp_file.write(code_with_spec)
    tmp_file.close()
    cmd = os.path.abspath("..") + "/openjml/openjml --esc --esc-max-warnings 1 --arithmetic-failure=quiet --quiet " + tmp_filename
    res_lines = os.popen(cmd).readlines()
    res = ""
    for line in res_lines:
        res = res + line
    return res

def IsValidFileName(fileName):
    if not re.match("log.*txt", fileName):
        return False
    arr_fileName = fileName.split("-")
    if arr_fileName[0] != "log":
        return False
    dateStr = arr_fileName[2]
    arr_dateStr = dateStr.split('_')
    if int(arr_dateStr[1]) < 9:
        return False
    return True

def ProcessFile(fileName):
    code = ""
    with FileReadBackwards("./{filename}".format(filename=fileName)) as fLog:
        for line in fLog:
            code = line + "\n" + code
            if line.find("class") != -1:
                break
    arr_fileName = fileName.split("-")
    className = arr_fileName[1]
    err_info = validate_openjml(code, className)
    return err_info == ""
               
def main():
    recordDict = {}
    seenFileNameDict = {}
    with open("./metadata.csv", "r") as f:
        print("Processing metadata......")
        for line in f:
            arr_line = line.strip().split(',')
            if len(arr_line) != 2:
                break
            fileName = arr_line[0]
            print("Found {fileName}, ".format(fileName=fileName), end="", flush=True)
            seenFileNameDict[fileName] = ""
            arr_fileName = fileName.split("-")
            className = arr_fileName[1]
            temp_arr = recordDict.get(className, [0,0])
            temp_arr[1] = temp_arr[1] + 1
            if arr_line[1] == "1":
                print("passed")
                temp_arr[0] = temp_arr[0] + 1
            else:
                print("failed")
            recordDict[className] = temp_arr
        print("Metadata successfully processed!")

    f_metadata = open("./metadata.csv", "a")
    print("Processing log files......")
    for dirPath, dirNames, fileNames in os.walk("."):
        total_num = len(fileNames)
        current_num = 0
        for fileName in fileNames:
            current_num = current_num + 1
            print("({num1}/{num2}) Found {fileName}, ".format(num1=current_num, num2=total_num, fileName=fileName), end="", flush=True)
            if not IsValidFileName(fileName):
                print("not valid log")
                continue
            if seenFileNameDict.get(fileName, "Not seen") == "":
                print("seen in metadata")
                continue
            seenFileNameDict[fileName] = ""            
            arr_fileName = fileName.split("-")
            className = arr_fileName[1]
            temp_arr = recordDict.get(className, [0,0])
            temp_arr[1] = temp_arr[1] + 1
            print("processing...", end="")
            if ProcessFile(fileName):
                print("passed. ", end="")
                temp_arr[0] = temp_arr[0] + 1
                f_metadata.write("{fileName},1\n".format(fileName=fileName))
            else:
                print("failed. ", end="")
                f_metadata.write("{fileName},0\n".format(fileName=fileName))
            print("Testcase {className} is now {num1}/{num2}.".format(className=className, num1=temp_arr[0], num2=temp_arr[1]))
            recordDict[className] = temp_arr
    f_metadata.close()
    with open("./success_prob.csv", "w") as f:
        for key in recordDict.keys():
            temp_arr = recordDict.get(key, [0,0])
            f.write("{className},={num1}/{num2}\n".format(className=key, num1=temp_arr[0], num2=temp_arr[1]))

if __name__ == "__main__":
    main()  