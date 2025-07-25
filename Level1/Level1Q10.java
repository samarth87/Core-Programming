package Level1;
import java.util.Scanner;

public class Level1Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        double number;

        System.out.println("Enter numbers to sum (enter 0 to stop):");

        // Read the first input
        number = scanner.nextDouble();

        // Loop until the user enters 0
        while (number != 0) {
            total += number;  // Add to total
            System.out.println("Current Total: " + total);
            System.out.print("Enter another number (0 to stop): ");
            number = scanner.nextDouble();  // Ask again
        }

        System.out.println("Final Total Sum: " + total);
        scanner.close();
    }
}
