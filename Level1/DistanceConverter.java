package Level1;

import java.util.*;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance is " + distanceInFeet + " feet, which is " +
                String.format("%.2f", distanceInYards) + " yards and " +
                String.format("%.5f", distanceInMiles) + " miles.");
    }
}
