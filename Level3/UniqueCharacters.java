// Find unique characters in a string using the charAt() method and display the result
//Hint =>
//Create a Method to find the length of the text without using the String method length()
//Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array. The logic used here is as follows:
//Create an array to store the unique characters in the text. The size is the length of the text
//Loops to Find the unique characters in the text. Find the unique characters in the text using a nested loop. An outer loop iterates through each character and an inner loop checks if the character is unique by comparing it with the previous characters. If the character is unique, it is stored in the result array
//Create a new array to store the unique characters
//Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.

import java.util.Scanner;

public class UniqueCharacters {

    // Method to get length of the string without using length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Reached end of string
        }
        return count;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int len = getLength(text);
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

        // Trim the array to only the unique characters
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(input);

        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
