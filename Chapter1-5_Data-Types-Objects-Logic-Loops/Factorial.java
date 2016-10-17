import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        // obtain data from User
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter an integer for Factorial: ");
        int n = console.nextInt();

        // compute and print
        if (n < 0) {
            throw new IllegalArgumentException("The input " + n + " is Negtive");
        }
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
    }
}
