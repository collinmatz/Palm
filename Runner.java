import java.io.*;
import java.util.Scanner;

/* Class: Runner
   a runner to test the lexer
*/

// TODO: Implement file type checking

public class Runner {
    public static void main(String args[]) {
        Lexer lexer = new Lexer();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print(">>> ");
            String infilename = scanner.nextLine();
            try {
                File infile = new File(infilename);
                File outfile = new File(infilename + ".palm");
                if (!outfile.createNewFile()) {
                    if (!outfile.delete()) {
                        System.out.println("Error when attempting to create output file");
                        break;
                    }
                }
                // File outfile = new File()
                Scanner infileReader = new Scanner(infile);
                FileWriter outfileWriter = new FileWriter(outfile);
                while (infileReader.hasNextLine()) {
                    String inp = infileReader.nextLine();
                    Lexer.Pair<?> pair = lexer.lex(inp);
                    outfileWriter.write("(" + pair.getToken() + ", " + pair.getLexeme() + ")\n");
                }
                infileReader.close();
                outfileWriter.close();
            }
            catch (Exception e) {
                System.out.println("Cannot find the specified file, " + e);
            }
        }
        scanner.close();
    }
}
