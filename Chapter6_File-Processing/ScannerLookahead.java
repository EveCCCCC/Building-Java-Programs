import java.util.*;

public class ScannerLookahead {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Token: ");
        System.out.println(" hasNextInt = " + console.hasNextInt());
        System.out.println(" hasNextDouble = " + console.hasNextDouble());
        System.out.println(" hasNext = " + console.hasNext());

        System.out.print("How old are you?  ");
        while (!console.hasNextInt()) {
            console.next();
            System.out.println("Not an integer, try again...");
            System.out.print("How old are you?  ");
        }
        int age = console.nextInt();
        System.out.println("\nYour age is: " + age);
    }
}
