import java.io.*;
import java.util.Scanner;

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
            String filename = scanner.nextLine();
            try {
                File file = new File(filename);
                Scanner fileReader = new Scanner(file);
                while (fileReader.hasNext()) {
                    String data = fileReader.next();
                    System.out.print(data);
                }
                fileReader.close();
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}