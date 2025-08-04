// Write a Java program that accepts two strings from the user and checks if the two strings are anagrams of each other (i.e., whether they contain the same characters in any order).

import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
            sc.close();
            return;
        }

        int[] count = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for (int i : count) {
            if (i != 0) {
                System.out.println("The strings are not anagrams.");
                sc.close();
                return;
            }
        }

        System.out.println("The strings are anagrams.");
        sc.close();
    }
}
