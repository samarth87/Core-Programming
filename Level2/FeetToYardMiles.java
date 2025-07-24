package Level2;

import java.util.*;

public class FeetToYardMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + String.format("%.2f", distanceInYards) +
                " while the distance in miles is " + String.format("%.5f", distanceInMiles));
    }
}
