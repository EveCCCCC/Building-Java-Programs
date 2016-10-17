import java.util.*;

public class Hanoi {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("How many plates: ");
        int n = console.nextInt();
        tower(n ,"x" ,"y" ,"z");
        }
    public static void tower(int n, String x, String y, String z) {
        if (n == 0) {
            return;
        }
        tower(n-1, x, z, y);
        System.out.println("\tMove " + n + " from " + x + " to " + y);
        tower(n-1, z, y, x);
    }
}
