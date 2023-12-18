cd ../..
ls ./testcases/common/
for dirname in `ls ./testcases/common/`
do
    if test -d ./testcases/common/${dirname}
    then
        for i in {1..5}
        do
            echo "python3.10 ./HoudiniGPT.py --max_iterations 10 --input ./testcases/common/${dirname}/${dirname}.java"
            python3.10 ./HoudiniGPT.py --max_iterations 10 --input ./testcases/common/${dirname}/${dirname}.java
            sleep 20s
            echo "python3.10 ./HoudiniGPT.py --max_iterations 10 --input ./testcases/common/${dirname}/${dirname}.java"
            python3.10 ./HoudiniGPT.py --max_iterations 10 --input ./testcases/common/${dirname}/${dirname}.java
            sleep 20s
            echo "python3.10 ./HoudiniGPT.py --max_iterations 10 --input ./testcases/common/${dirname}/${dirname}.java"
            python3.10 ./HoudiniGPT.py --max_iterations 10 --input ./testcases/common/${dirname}/${dirname}.java
            sleep 20s
            echo "python3.10 ./HoudiniGPT.py --max_iterations 10 --input ./testcases/common/${dirname}/${dirname}.java"
            python3.10 ./HoudiniGPT.py --max_iterations 10 --input ./testcases/common/${dirname}/${dirname}.java
            sleep 20s
            echo "python3.10 ./HoudiniGPT.py --max_iterations 10 --input ./testcases/common/${dirname}/${dirname}.java"
            python3.10 ./HoudiniGPT.py --max_iterations 10 --input ./testcases/common/${dirname}/${dirname}.java
            sleep 20s
        done
    fi
done
