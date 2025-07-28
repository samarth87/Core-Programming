package JAVA_ARRAYS.Level2;

import java.util.*;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }
        System.out.println();
    }
}
