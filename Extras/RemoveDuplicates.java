// Remove Duplicates from a String
//Problem:
//Write a Java program to remove all duplicate characters from a given string and return the modified string.

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to remove duplicates:");
        String input = sc.nextLine();

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch; // Add only if not already present
            }
        }

        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}

