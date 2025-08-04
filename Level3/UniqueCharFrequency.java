// Write a program to find the frequency of characters in a string using unique characters and display the result
//Hint =>
//Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.  Use Nested Loops to find the unique characters in the text
//Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
//Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
//Loop through the text to find the frequency of characters in the text
//Call the uniqueCharacters() method to find the unique characters in the text
//Create a 2D String array to store the unique characters and their frequencies.
//Loop through the unique characters and store the characters and their frequencies
//In the main function take user inputs, call user-defined methods, and displays result.

import java.util.Scanner;

public class UniqueCharFrequency {

    public static char[] getUniqueChars(String text) {
        int len = text.length();
        char[] unique = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index++] = current;
            }
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static int[][] getFrequencyUsingUnique(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = getUniqueChars(text);
        int[][] result = new int[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = unique[i];
            result[i][1] = freq[unique[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[][] frequency = getFrequencyUsingUnique(input);
        System.out.println("Character Frequency (using unique chars):");
        for (int[] row : frequency) {
            System.out.println((char) row[0] + " : " + row[1]);
        }
    }
}

