public class BMI {
    public static void main(String[] args) {
        // declare variables
        double height, weight, bmi;
        height = 70;  weight = 95; bmi = weight/(height*height)*703;
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
