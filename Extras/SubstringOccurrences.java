// Find Substring Occurrences
//Problem:
//Write a Java program to count how many times a given substring occurs in a string.

import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainStr = sc.nextLine();

        System.out.println("Enter the substring to count:");
        String subStr = sc.nextLine();

        int count = 0;
        for (int i = 0; i <= mainStr.length() - subStr.length(); i++) {
            if (mainStr.substring(i, i + subStr.length()).equals(subStr)) {
                count++;
            }
        }

        System.out.println("Substring occurs " + count + " time(s).");
        sc.close();
    }
}
