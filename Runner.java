import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

/* Class: Runner
   a runner to test the lexer
*/

// TODO: Implement file type checking
// TODO: Implement file output

public class Runner {
    public static void main(String args[]) {
        Lexer lexer = new Lexer();
        FileInputStream in = null;
        FileOutputStream out = null;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print(">>> ");
            String infilename = scanner.nextLine();
            try {
                File infile = new File(infilename);
                // File outfile = new File()
                Scanner infileReader = new Scanner(infile);
                while (infileReader.hasNextLine()) {
                    String inp = infileReader.nextLine();
                    Lexer.Pair pair = lexer.lex(inp);
                    System.out.println("(" + pair.getToken() + ", " + pair.getLexeme() + ")");
                }
                infileReader.close();
            }
            catch (Exception e) {
                System.out.println("Cannot find the specified file, " + e);
            }
        }
    }
}