// the prototype the student will see
import java.util.*;

public class Mortage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Obtain values
        System.out.println("This program will computes" +
                            " monthly mortage payments");
        System.out.print("Loan amount: ");
        double loan = console.nextDouble();
        System.out.print("Number of years: ");
        double years = console.nextDouble();
        System.out.print("Interest rate: ");
        double rate = console.nextDouble();

        // Compute result and report
        double n = 12 * years;
        double c = rate / 12.0 / 100.0;
        double payment = loan*c*Math.pow(1+c, n) /
                          (Math.pow(1+c,n) - 1);
        System.out.println("Payment = $" + (int)payment);
    }
}





// -------------------------------------------------------
