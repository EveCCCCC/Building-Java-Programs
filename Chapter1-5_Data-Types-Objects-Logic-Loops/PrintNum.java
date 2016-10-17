import java.util.*;

public class PrintNum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(Math.random());
        System.out.print("Please Enter a Num: ");
        int num = console.nextInt();
        while (num > 0) {
            System.out.println(num + "\n");
            System.out.print("Please Enter a Num or a NegNum to stop: ");
            num = console.nextInt();
            System.out.println(Math.random());
        }
    }
}
