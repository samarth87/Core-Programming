package Level1;
import java.util.Scanner;

public class Level1Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check eligibility and calculate bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("You are eligible for a bonus.");
            System.out.println("Bonus Amount: ₹" + bonus);
        } else {
            System.out.println("You are not eligible for a bonus.");
        }

        scanner.close();
    }
}
