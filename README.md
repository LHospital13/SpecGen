# SpecGen

A JML specification generation tool based on Large Language Model for Java programs.



## Prerequisites

### OpenJML

This artifact relies on OpenJML, an JML specification verification tool. To install OpenJML, run

```
wget -O openjml.zip https://github.com/OpenJML/OpenJML/releases/download/0.17.0-alpha-15/openjml-ubuntu-20.04-0.17.0-alpha-15.zip
mkdir openjml
unzip -d ./openjml openjml.zip 
```

or `sh ./get_openjml.sh` on the root directory of this artifact.

### Python OpenAI Package

This artifact is based on the API services provided by OpenAI. If you haven't installed relevant packages, please use

```shell
pip install openai
```

in your shell to install them.

### OpenAI API Key

To access OpenAI API, you need a personal API key. Please fill your own API key into `api_key.txt`.



## Usage

To run SpecGen, use command

```
python SpecGen.py --input [InputJavaCodePath]
```

where `[InputJavaCodePath]` is the path of the input `.java` file.
