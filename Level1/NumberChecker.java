package Java_Methods.Level1;

import java.util.Scanner;

public class NumberChecker {
    public static int checkNumber(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int result = checkNumber(num);
        if (result == -1) {
            System.out.println("The number is negative.");
        } else if (result == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is positive.");
        }
    }
}
