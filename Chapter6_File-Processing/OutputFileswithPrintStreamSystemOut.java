import java.util.*;
import java.io.*; // for File

public class OutputFileswithPrintStreamSystemOut {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("OutputFileswithPrintStreamSystemOut_input.txt"));
        PrintStream output = new PrintStream(new File("OutputFileswithPrintStreamSystemOut_output.txt"));
        while (input.hasNextLine()) {
            String text = input.nextLine();
            echoFixed(text, output);
            echoFixed(text, System.out);
        }
    }
    public static void echoFixed(String text, PrintStream output) {
        Scanner data = new Scanner(text);
        if (data.hasNext()) {
            output.print(data.next()) ;
            while (data.hasNext()) {
                output.print(" " + data.next());
            }
        }
        output.println();
    }
}

/*
    four         score    and
 seven    years ago    our
        fathers brought  forth on this     continent
          a       new nation,     conceived  in    liberty and  dedicated   to  the       proposition    that
            all   men    are     created    equal

to

four score and
seven years ago our
fathers brought forth on this continent
a new nation, conceived in liberty and dedicated to the proposition that
all men are created equal
*/
