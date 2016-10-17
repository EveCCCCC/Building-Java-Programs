import java.util.*;
import java.io.*;

public class GuaranteeingFilesCanBeRead {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        Scanner input = getInput(console);

        // and count words
        int count = 0;
        while (input.hasNext()) {
            String word = input.next();
            count += 1;
        }
        System.out.println("Total words is: " + count);
    }

    // Prompts the user for a legal file names
    // Craetes and Return a Scanner tied to the file
    public static Scanner getInput(Scanner console) throws FileNotFoundException {
        System.out.print("Input file name: ");
        File f = new File(console.next());
        while (!f.canRead()) {
            System.out.println("File not found, try again... ");
            System.out.print("Input file name: ");
            f = new File(console.next());
        }
        // now we know that f is a file and can be read
        return new Scanner(f);
    }
}
