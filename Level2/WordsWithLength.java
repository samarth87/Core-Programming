// Write a program to split the text into words and return the words along with their lengths in a 2D array
//Hint =>
//Take user input using the Scanner nextLine() method
//Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
//Create a method to find and return a string's length without using the length() method.
//Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
//The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display

import java.util.Scanner;

public class WordsWithLength {
    static int getLength(String s) {
        int count = 0;
        try {
            while (true) s.charAt(count++);
        } catch (Exception e) {
            return count;
        }
    }

    static String[] splitWords(String text) {
        int length = getLength(text);
        int spaceCount = 0;
        for (int i = 0; i < length; i++)
            if (text.charAt(i) == ' ') spaceCount++;

        String[] words = new String[spaceCount + 1];
        int start = 0, idx = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = text.substring(start);
        return words;
    }

    static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordsWithLength(words);

        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}

