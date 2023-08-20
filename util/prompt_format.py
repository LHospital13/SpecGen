FORMAT_INIT_PROMPT = """
Please generate JML specifications for the Java program given below.
```
{src_code}
```
"""

FORMAT_REFINE_PROMPT = """
Your specification got the following error information:

{err_info}

Please generate again.
"""

FORMAT_GENERATION_PROMPT = """
Please generate JML specifications for the Java program given below.
```
{src_code}
```
Note that you should try to generate loop invariant specifications for each loop in the program.
"""

FORMAT_REFINEMENT_PROMPT = """
The following Java code is instrumented with JML specifications:
```
{code}
```
Verifier failed to verify the specifications given above, with error information as follows:
```
{info}
```
Please refine the specifications, so that it can pass the verification.
"""