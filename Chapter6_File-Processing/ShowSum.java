import java.util.*;
import java.io.*;

public class ShowSum {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\difan\\Desktop\\CS11A\\ShowSum.txt"));
        //Scanner input = new Scanner(new File("C:/Users/difan/Desktop/CS11A/ShowSum.txt"));
        File f = new File("ShowSum.txt");
        System.out.println(f.length() + "\n");

        double sum = 0.0;
        int i = 0;  //
        while (input.hasNextDouble()) {  //
        //for (int i = 1; i <= 5; i++) {
            i += 1;
            double next = input.nextDouble();
            System.out.println("number " + i + " = " + next);
            sum += next;
        }
        System.out.println("Sum = " + sum);
    }
}
