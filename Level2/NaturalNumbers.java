package Java_Methods.Level2;

import java.util.Scanner;

public class NaturalNumbers {
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("The number is not a natural number. Exiting.");
            return;
        }
        int sumRecursion = recursiveSum(n);
        int sumFormula = formulaSum(n);
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);
        if (sumRecursion == sumFormula) {
            System.out.println(" Both results are equal. The computation is correct.");
        } else {
            System.out.println(" Results do not match. Please check the implementation.");
        }
    }
}
