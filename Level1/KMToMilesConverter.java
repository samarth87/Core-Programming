package Level1;

import java.util.*;

public class KMToMilesConverter {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();
        double miles = km / 1.6;
        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}
