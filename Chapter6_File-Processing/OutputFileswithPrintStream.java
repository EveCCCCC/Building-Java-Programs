import java.util.*;
import java.io.*; // for File

public class OutputFileswithPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("OutputFileswithPrintStream.txt"));
        output.println("Hello World");
        output.println("Hello World!");
        output.println("Hello World!!");
        output.println("Hello World!!!");
    }
}
