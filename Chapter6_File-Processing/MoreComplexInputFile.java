import java.util.*;
import java.io.*;

public class MoreComplexInputFile {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("MoreComplexInputFile.txt"));
        Scanner input2 = new Scanner(new File("MoreComplexInputFile.txt"));
        processLine(input1);
        System.out.println();
        processToken(input2);
    }
    public static void processLine(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line.toUpperCase());
        }
    }
    public static void processToken(Scanner input) {
        while (input.hasNext()) {
            String name = input.next();
            double sum = 0.0;
            while (input.hasNextDouble()) {
                sum += input.nextDouble();
            }
            System.out.println(name + "\t" + sum);
        }
    }
}
