package Level1;
import java.util.Scanner;

public class Level1Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;

        System.out.println("Enter numbers to sum (enter 0 or a negative number to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            // Check if number is 0 or negative to exit the loop
            if (number <= 0) {
                break;
            }

            // Add to total
            total += number;
        }

        System.out.println("Final Total Sum: " + total);
        scanner.close();
    }
}
