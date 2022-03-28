# Palm
List of files | Purpose
Lexer$Pair.class  |  Class file for Lexer.pair
Lexer.class       |  Class file for Lexer
Lexer.java        |  Source file for the Lexer code
Runner.class      |  Class file for Runner
Runner.java       |  Source file for the Runner code

How to compile:
From the base directory, type "javac Runner.java" to compile

How to run:
After compilation, run the runner file with "java Runner -options". Currently, there are two supported options, t and f.
    -t: run the program in terminal mode. The tokens will be printed to the command line
    -f: run the program in fild mode. The tokens will be printed to an output file

Example of Compilation and Run:
INPUT: 
>>> javac Runner.java
>>> java Runner -f
>>> ./Test Programs/test2
OUTPUT: test2.palm

Note: Regardless of what mode you run the program in, the tokens must be read from an input file. Running the program in terminal mode will not allow you to type strings into the command line and have their tokens returned to you.

IMPORTANT: Different versions of java will not be able to recompile the program if the class files are outdated. To ensure this problem doesn't arise, delete all the compiled class files before you push to the repo.



