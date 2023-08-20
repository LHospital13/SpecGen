import ASTExtractor.astextractor
import argparse

def file2str(filename):
    res = ""
    with open(filename,"r") as f:
        for line in f.readlines():
            res = res + line
    return res

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--input", type=str, default="")
    args = parser.parse_args()

    ast_extractor = ASTExtractor.astextractor.ASTExtractor("./ASTExtractor/ASTExtractor.jar", "./ASTExtractor/ASTExtractor.properties")
    ast = ast_extractor.parse_string(file2str(args.input), "JSON")
    print(ast)

if __name__ == "__main__":
    main()