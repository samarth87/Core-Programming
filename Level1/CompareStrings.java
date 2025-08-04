// Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
//Hint =>
//Take user input using the  Scanner next() method for 2 String variables
//Write a method to compare two strings using the charAt() method and return a boolean result
//Use the String Built-In method to check if the results are the same and display the result

import java.util.Scanner;

public class CompareStrings {
    static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        System.out.println("Manual comparison: " + compare(str1, str2));
        System.out.println("Built-in equals(): " + str1.equals(str2));
    }
}
