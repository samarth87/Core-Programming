// Compare Two Strings
//Problem:
//Write a Java program to compare two strings lexicographically (dictionary order) without using built-in compare methods.
//Example Input:
//String 1: "apple"
//String 2: "banana"
//Expected Output:
//"apple" comes before "banana" in lexicographical order

import java.util.Scanner;

public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        int minLen = Math.min(str1.length(), str2.length());
        boolean isSame = true;

        for (int i = 0; i < minLen; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (str1.charAt(i) < str2.charAt(i)) {
                    System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
                } else {
                    System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\"");
                }
                isSame = false;
                break;
            }
        }

        if (isSame) {
            if (str1.length() < str2.length()) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
            } else if (str1.length() > str2.length()) {
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\"");
            } else {
                System.out.println("Both strings are equal.");
            }
        }

        sc.close();
    }
}
