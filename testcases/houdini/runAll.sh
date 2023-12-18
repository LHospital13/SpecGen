export OPENJML_PATH=/home/max/Documents/JMLGPT/openjml
export PATH=$OPENJML_PATH:$PATH
for dirname in `ls`
do
    if test -d $dirname
    then
	echo "sh ../../../genJML.sh ${dirname}"
	sh ../../../genJML.sh ${dirname} > /dev/null
        cat ./${dirname}/${dirname}.java-escannotated > ./${dirname}.java
        echo "openjml -esc --arithmetic-failure=quiet --nonnull-by-default --quiet -nowarn ./${dirname}.java"
        openjml -esc --arithmetic-failure=quiet --nonnull-by-default --quiet -nowarn ./${dirname}.java > ./${dirname}/result.txt
        cat ./${dirname}/result.txt
        rm ./${dirname}.java
    fi
done
