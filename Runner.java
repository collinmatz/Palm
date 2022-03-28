import java.io.*;
import java.util.Scanner;

/* Class: Runner
   a runner to test the lexer
*/

public class Runner {
    public static void main(String args[]) {
        String mode = "";
        if (args.length > 0) {
            try {
                if (args[0].charAt(0) == '-')
                    mode = args[0];
            }
            catch (Exception e) {
                System.out.println("Illegal argument " + args[0]);
                System.exit(1);
            }
        }
        Lexer lexer = new Lexer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Palm! Type 'quit' to terminate the program at any time.");

        while(true) {
            System.out.print(">>>");
            String input = scanner.nextLine();
            if (input.equals("quit"))
                break;

            File infile = null;
            Scanner infileReader = null;
            try {
                infile = new File(input);
                infileReader = new Scanner(infile);
            }
            catch(FileNotFoundException e) {
                System.out.println("Unable to find file: " + e);
            }

            if (mode.equals("-t")) {
                while (infileReader.hasNext()) {
                    String inp = infileReader.next();
                    Lexer.Pair<?> pair = lexer.lex(inp);
                    try {
                        System.out.print("(" + pair.getToken() + ", " + pair.getLexeme() + ")\n");
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                }
            }

            else {
                try {
                    File outfile = new File(input + ".palm");
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
                    outfileWriter.close();
                }
                catch (Exception e) {
                    System.out.println("Error when attempting to execute: " + e);
                }
            }
            infileReader.close();
        } // end while
        scanner.close();
    }
}
