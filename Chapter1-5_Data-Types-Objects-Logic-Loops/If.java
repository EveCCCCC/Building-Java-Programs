// the prototype the student will see
import java.util.*;

public class If {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = console.nextInt();
        if (n > 0) {
            double answer = Math.sqrt(n);
            System.out.println("Sqrt of " + n + " is " + answer);
        } else if (n == 0) {
              System.out.println("Sqrt of zero is zero");
        } else {
            System.out.println("Negtive number has no Sqrt");
        }
    }
}





// -------------------------------------------------------
