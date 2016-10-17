// the prototype the student will see
import java.util.*;   // for Scanner

public class Projectile {
    // constant for Earth acceleration in meters/second^2
    public static final double G = -9.81;

    public static void main(String[] args) {
        // Give intro
        giveIntro();
        // Obtain values from user
        Scanner console = new Scanner(System.in);
        System.out.print("Velocity (meters/second): ");
        double velocity = console.nextDouble();
        System.out.print("Angel (degrees): ");
        double angle = Math.toRadians(console.nextDouble());
        System.out.print("Number of steps to display: ");
        int steps = console.nextInt();
        // Compute and print
        printTable(velocity, angle, steps);
    }
    
    public static void giveIntro() {
        System.out.println("This program computes the");
        System.out.println("trajectory of a projectile given");
        System.out.println("its initial velocity and its");
        System.out.println("angle relative to the");
        System.out.println("horizontal.");
        System.out.println();
    }

    public static void printTable(double velocity, double angle, int steps) {
        double xVelocity = velocity * Math.cos(angle);
        double yVelocity = velocity * Math.sin(angle);
        double totalTime = -2.0 * yVelocity / G;
        double timeIncrement = totalTime / steps;
        double xIncrement = xVelocity * timeIncrement;

        double x = 0.0;
        double y = 0.0;
        double t = 0.0;
        System.out.println("Step\tx\ty\ttime");
        System.out.println("0\t0.0\t0.0\t0.0");
        for (int i = 1; i <= steps; i++) {
            t += timeIncrement;
            x += xIncrement;
            y = yVelocity * t + 0.5 * G * t * t;
            System.out.println(i + "\t" + round2(x) + "\t" +
                                round2(y) + "\t" + round2(t));
        }
    }

    public static double round2(double n) {
        return Math.round(n*100)/100.0;
    }
}
