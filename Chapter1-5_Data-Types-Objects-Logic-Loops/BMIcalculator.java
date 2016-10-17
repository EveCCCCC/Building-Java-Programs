public class BMIcalculator {
    public static void main(String[] args) {
        // declare variables
        double height;
        double weight;
        double bmi;

        // compute bmi
        height = 70;
        weight = 195;
        bmi = weight/(height*height)*703;

        // print results
        System.out.println("Current BMI:");
        System.out.println(bmi);

        // print new results
        System.out.println("New BMI");
        System.out.println((weight-15)/(height*height)*703);
        weight = 180;
        bmi = weight/(height*height)*703;
        System.out.println(bmi);
        //System.out.println((weight-10)/(height*height)*703);
    }
}
