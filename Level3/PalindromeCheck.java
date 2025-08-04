// Write a program to to check if a text is palindrome and display the result
//Hint =>
//A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
//Logic 1: Write a method to compare the characters from the start and end of the string to determine whether the text is palindrome. The logic used here is as follows:
//Set the start and end indexes of the text
//Loop through the text and compare the characters from the start and the end of the string. If the characters are not equal, return false
//Logic 2: Write a recursive method to compare the characters from the start and end of the text passed as parameters using recursion. The logic used here is as follows:
//First, check if the start index is greater than or equal to the end index, then return true.
//If the characters at the start and end indexes are not equal, return false.
//Otherwise, call the method recursively with the start index incremented by 1 and the end index
//Logic 3: Write a Method to compare the characters from the start and end of the text using character arrays. The logic used here is as follows:
//Firstly Write a Method to reverse a string using the charAt() method and return the reversal array.
//Create a character array using the String method toCharArray() and also create a reverse array. Compare the characters in the original and reverse arrays to do a Palindrome check
//Finally, in the main method do palindrome check using the three logic and display result

import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: compare from start and end
    public static boolean isPalindrome1(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start++) != text.charAt(end--)) return false;
        }
        return true;
    }

    // Logic 2: recursion
    public static boolean isPalindrome2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindrome2(text, start + 1, end - 1);
    }

    // Logic 3: reverse and compare
    public static boolean isPalindrome3(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = text.charAt(original.length - 1 - i);
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        System.out.println("Palindrome (Logic 1): " + isPalindrome1(input));
        System.out.println("Palindrome (Logic 2): " + isPalindrome2(input, 0, input.length() - 1));
        System.out.println("Palindrome (Logic 3): " + isPalindrome3(input));
    }
}
