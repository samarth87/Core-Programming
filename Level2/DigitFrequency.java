package JAVA_ARRAYS.Level2;

import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] frequency = new int[10]; // Index 0-9 for digits

        int originalNum = num;
        while (num > 0) {
            int digit = num % 10;
            frequency[digit]++;
            num /= 10;
        }

        System.out.println("\nDigit Frequency in number: " + originalNum);
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
