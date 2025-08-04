// Toggle Case of Characters
//Problem:
//Write a Java program to toggle the case of each character in a given string. Convert uppercase letters to lowercase and vice versa.

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to toggle case:");
        String input = sc.nextLine();

        StringBuilder toggled = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch); // Keep symbols/numbers unchanged
            }
        }

        System.out.println("Toggled string: " + toggled.toString());
        sc.close();
    }
}

