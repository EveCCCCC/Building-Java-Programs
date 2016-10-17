import java.util.*;
import java.io.*;

public class A {
    // radius of sphere. Here it's the earth, in miles
    public static final double RADIUS = 3956.6;

    public static void main(String[] args) throws FileNotFoundException {
        giveIntro();
        Scanner console = new Scanner(System.in);

        System.out.print("What's your zipcode: ");
        String target = console.next();
        System.out.println();

        Scanner input = new Scanner(new File("zipcode_temp.txt"));
        String targetCoordinates = find(target, input);
        //input = new Scanner(new File("zipcode.txt"));
        //showMatches(targetCoordinates, input, miles);
    }

    // introcues the program to the user
    public static void giveIntro() {
        System.out.println("Welcome to the zip code database.");
        System.out.println("Let me loop up zipcodes within a given proximity to you.");
        System.out.println();
    }

    // Searches for the given string in the input file; if found,
    // return the coordinates; otherwise returns (0, 0)
    public static String find(String target, Scanner input) {
        while (input.hasNextLine()) {
            input.nextLine();
            String zip = input.nextLine();
            String city = input.nextLine();
            String coordinates = input.nextLine();
            input.nextLine();
            if (zip.equals(target)) {
                System.out.println(zip + ": " + city + '\n');
                return coordinates;
            }
        }
        // at this point we know the zip code isn't in the file
        // we return fictitious (no match) coordinates
        return "0 0";
    }

    // Shows all matches for the given coordinates within the
    // given number of miles
    public static void showMatches(String targetCoordinates, Scanner input, double miles) {
        Scanner data = new Scanner(targetCoordinates);
        double lat1 = data.nextDouble();
        double long1 = data.nextDouble();
        System.out.println("zip codes within " + miles + " miles:");
        while (input.hasNextLine()) {
            String zip = input.nextLine();
            String city = input.nextLine();
            String coordinates = input.nextLine();
            data = new Scanner(coordinates);
            double lat2 = data.nextDouble();
            double long2 = data.nextDouble();
            double distance = distance(lat1, long1, lat2, long2);
            if (distance <= miles) {
                System.out.printf("%s %s, %3.2f miles\n", zip, city, distance);
            }
        }
    }

    // Returns spherical distance in miles given the latitude
    // and longitude of two points (depends on constant RADIUS)
    public static double distance(double lat1, double long1, double lat2, double long2) {
        lat1 = Math.toRadians(lat1);
        long1 = Math.toRadians(long1);
        lat2 = Math.toRadians(lat2);
        long2 = Math.toRadians(long2);
        double theCos = Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
    }
}
