import java.util.*;

public class BMI_Structured {
    public static void main(String[] args) {
        BMI();
        BMI();
    }
    public static void BMI() {
        // obtain data from user
        Scanner console = new Scanner(System.in);
        System.out.println("Enter next person's information:");
        System.out.print("height (in inches)? ");
        double height1 = console.nextDouble();
        System.out.print("weight (in pounds)? ");
        double weight1 = console.nextDouble();

        // calculate and print
        double bmi1 = weight1 / (height1 * height1) * 703;
        System.out.println();
        System.out.printf("Person #1 body mass index = %.2f\n", bmi1);
        if (bmi1 < 18.5) {
            System.out.println("underweight");
        } else if (bmi1 < 25) {
            System.out.println("normal");
        } else if (bmi1 < 30) {
            System.out.println("overweight");
        } else {  // bmi1 >= 30
            System.out.println("obese");
        }
        System.out.println();
    }
}
