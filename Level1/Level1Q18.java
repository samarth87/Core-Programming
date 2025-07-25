package Level1;
import java.util.Scanner;

public class Level1Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take number input from user
        System.out.print("Enter a number to print its multiplication table (from 6 to 9): ");
        int number = scanner.nextInt();

        // Print multiplication table from 6 to 9
        System.out.println("Multiplication Table of " + number + " from 6 to 9:");

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        scanner.close();
    }
}


