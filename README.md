# Palm
List of files | Purpose
Lexer$Pair.class  |  Class file for Lexer.pair
Lexer.class       |  Class file for Lexer
Lexer.java        |  Source file for the Lexer code
Runner.class      |  Class file for Runner
Runner.java       |  Source file for the Runner code

How to compile:
From the base directory, run "javac Runner.java" to compile

How to run:
After compilation, run the runner file with "java Runner". You can then type the pathname of your file into the terminal and its tokens will be output to a file titled {inputfile name}.palm in the base directory.

Example: 
INPUT: ./Test Programs/test2
OUTPUT: test2.palm

Notes:
Currently, only test2 and test4 are partially working. Modifications need to be made to fix for-loop-test and test3.

IMPORTANT: Different versions of java will not be able to recompile the program if the class files are outdated. To ensure this problem doesn't arise, delete all the compiled class files before you push to the repo.
