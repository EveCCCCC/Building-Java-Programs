import java.util.*;
import java.io.*;

public class LineTokenCombinations {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("LineTokenCombinations.txt"));
        Scanner input2 = new Scanner(new File("LineTokenCombinations.txt"));
        processLine(input1);
        System.out.println();
        processLineToken(input2);
    }
    public static void processLine(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line.toUpperCase());
        }
    }
    public static void processLineToken(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner data = new Scanner(line);
            int id = data.nextInt();
            String name = data.next();
            double sum = 0.0;
            while (data.hasNextDouble()) {
                sum += data.nextDouble();
            }
            System.out.println(id + "\t" +  name + "\t" + sum);
        }
    }
}
