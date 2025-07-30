package Java_Methods.Level1;

import java.util.Scanner;

public class TriangularParkRun {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double totalDistance = 5000;
        return totalDistance / perimeter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side A of the triangle (in meters): ");
        double sideA = scanner.nextDouble();
        System.out.print("Enter side B of the triangle (in meters): ");
        double sideB = scanner.nextDouble();
        System.out.print("Enter side C of the triangle (in meters): ");
        double sideC = scanner.nextDouble();
        double rounds = calculateRounds(sideA, sideB, sideC);

        System.out.printf("The athlete needs to complete %.2f rounds to run 5 km.\n", rounds);

    }
}
