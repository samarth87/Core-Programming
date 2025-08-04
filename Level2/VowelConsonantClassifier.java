// Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
//Hint =>
//Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
//Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
//Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
//Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
//Create a Method to display the 2D Array of Strings in a Tabular Format
//Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.

import java.util.Scanner;

public class VowelConsonantClassifier {
    static int getLength(String s) {
        int count = 0;
        try { while (true) s.charAt(count++); }
        catch (Exception e) { return count; }
    }

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int len = getLength(text);
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                System.out.println(ch + " is a " + (isVowel(ch) ? "Vowel" : "Consonant"));
            }
        }
    }
}

