import java.io.*;
import java.util.Scanner;

/* Class: Runner
   a runner to test the lexer
*/

public class Runner {
    public static void main(String args[]) {
        Lexer lexer = new Lexer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Palm! Type the pathname of the file you want to interpret. Type 'quit' to terminate.");

        while(true) {
            System.out.print(">>> ");
            String input = scanner.nextLine();
            if (input.equals("quit"))
                break;
            try {
                File infile = new File(input);
                File outfile = new File(input + ".palm");
                // File outfile = new File()
                Scanner infileReader = new Scanner(infile);
                FileWriter outfileWriter = new FileWriter(outfile);
                while (infileReader.hasNext()) {
                    String inp = infileReader.next();
                    Lexer.Pair<?> pair = lexer.lex(inp);
                    try {
                        outfileWriter.write("(" + pair.getToken() + ", " + pair.getLexeme() + ")\n");
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    
                }
                infileReader.close();
                outfileWriter.close();
            }
            catch (Exception e) {
                System.out.println("Error when attempting to execute: " + e);
            }
        }
        scanner.close();
    }
}
