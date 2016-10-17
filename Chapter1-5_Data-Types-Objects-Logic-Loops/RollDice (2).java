import java.util.*;

public class RollDice {
    public static void main (String[] args) {
        System.out.println("This program guesses the number you picks");
        System.out.println("between 1 and 10\n");

        Scanner console = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Pick a number between 1 to 10: ");
        int num = console.nextInt();

        int guess = -1; // set to -1 to make sure when enter the loop, a dummy
        int count = 0;
        while (guess != num) {
            guess = r.nextInt(10) + 1;  // random number from 1 to 10
            System.out.println("The guess is: " + guess);
            count += 1;
        }
        System.out.println("Your number is: " + guess);
        System.out.println("After " + count + " guesses");
    }
}
