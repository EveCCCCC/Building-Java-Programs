import java.util.*;

public class RollDice {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int target = -1, times = -1;
        while (target < 2 || target > 12) {
            System.out.print("What is the target number (between 2 and 12): ");
            target = console.nextInt();
        }
        while (times < 1) {
            System.out.print("How many times you want to simulate: ");
            times = console.nextInt();
        }

        int count = 0;
        for (int i = 0; i < times; i++) {
            count += rollOneDice(target);
        }
        System.out.println("Average guesses need to success is: " + (double)count/times);
    }

    public static int rollOneDice(int target) {
        Random r = new Random();
        int dice1, dice2, count = 0;
        do {
            dice1 = r.nextInt(6) + 1;
            dice2 = r.nextInt(6) + 1;
            count += 1;
        } while (dice1 + dice2 != target);
        return count;
    }
}
