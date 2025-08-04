// Write a program to find the frequency of characters in a string using the charAt() method and display the result
//Hint =>
//Create a method to find the frequency of characters in a string using the charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
//Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
//Loop through the text to find the frequency of characters in the text
//Create an array to store the characters and their frequencies
//Loop through the characters in the text and store the characters and their frequencies
//In the main function take user inputs, call user-defined methods, and displays result.

import java.util.Scanner;

public class CharFrequency {

    public static int[][] getFrequency(String text) {
        int[] freq = new int[256]; // ASCII size
        boolean[] counted = new boolean[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int[][] result = new int[text.length()][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!counted[ch]) {
                result[index][0] = ch;
                result[index][1] = freq[ch];
                counted[ch] = true;
                index++;
            }
        }

        int[][] trimmed = new int[index][2];
        for (int i = 0; i < index; i++) {
            trimmed[i] = result[i];
        }

        return trimmed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[][] frequency = getFrequency(input);
        System.out.println("Character Frequency:");
        for (int[] row : frequency) {
            System.out.println((char) row[0] + " : " + row[1]);
        }
    }
}
