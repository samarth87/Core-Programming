// Write a program to split the text into words, compare the result with the split() method and display the result
//Hint =>
//Take user input using the Scanner nextLine() method
//Create a Method to find the length of the String without using the built-in length() method.
//Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
//Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
//Then Create an array to store the words and use the indexes to extract the words
//Create a method to compare the two String arrays and return a boolean
//The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result


import java.util.Scanner;

public class ManualSplit {
    static int getLength(String s) {
        int count = 0;
        try {
            while (true) s.charAt(count++);
        } catch (Exception e) {
            return count;
        }
    }

    static String[] manualSplit(String text) {
        int length = getLength(text);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int start = 0, index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start);
        return words;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] manual = manualSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Match: " + compare(manual, builtin));
    }
}
