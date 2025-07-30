package Level1;
import java.util.Scanner;

public class Level1Q3 {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1 (in meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter side2 (in meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter side3 (in meters): ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);
        System.out.printf("The athlete must complete %.2f rounds to complete 5km.\n", rounds);
    }
}
