// Write a program to split the text into words and find the shortest and longest strings in a given text
//Hint =>
//Take user input using the Scanner nextLine() method
//Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
//Create a method to find and return a string's length without using the length() method.
//Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
//Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array.
//The main function calls the user-defined methods and displays the result.

import java.util.Scanner;

public class MinMaxWords {
    static int getLength(String s) {
        int count = 0;
        try { while (true) s.charAt(count++); }
        catch (Exception e) { return count; }
    }

    static String[] split(String text) {
        int len = getLength(text);
        int spaces = 0;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') spaces++;

        String[] words = new String[spaces + 1];
        int start = 0, idx = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = text.substring(start);
        return words;
    }

    static String[][] getWordLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    static int[] findMinMax(String[][] table) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minIdx = 0, maxIdx = 0;

        for (int i = 0; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < min) {
                min = len;
                minIdx = i;
            }
            if (len > max) {
                max = len;
                maxIdx = i;
            }
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] words = split(text);
        String[][] table = getWordLength(words);
        int[] minMax = findMinMax(table);

        System.out.println("Shortest word: " + table[minMax[0]][0]);
        System.out.println("Longest word: " + table[minMax[1]][0]);
    }
}

