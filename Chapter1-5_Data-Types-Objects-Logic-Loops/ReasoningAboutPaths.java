import java.util.*;

public class ReasoningAboutPaths {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter an integer for Factorial: ");
        int n = console.nextInt();
        System.out.println(Paths(n));
    }
    public static String Paths(int score) {
        if (score < 1200) {
            return "not competitive";
        } else if (score < 1800) {
            return "competitive";
        } else {
            return "highly competitive";
        }
    }
}
