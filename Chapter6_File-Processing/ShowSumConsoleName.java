import java.util.*;
import java.io.*;

public class ShowSumConsoleName {
    public static void main (String[] args) throws FileNotFoundException {
        System.out.println("This program will add a series");
        System.out.println("of numbers from a file.");
        System.out.println();

        Scanner console = new Scanner(System.in);
        System.out.print("What is the file name? ");
        String name = console.nextLine();   // type: C:/Users/difan/Desktop/CS11A/ShowSum.txt
        Scanner input = new Scanner(new File(name));
        System.out.println();

        double sum = 0.0;
        int count = 0;
        while (input.hasNextDouble()) {
          double next = input.nextDouble();
          count += 1;
          System.out.println("number " + count + " = " + next);
          sum += next;
        }
        System.out.println("Sum = " + sum);
    }
}
