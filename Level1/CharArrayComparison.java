// Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
//Hint =>
//Take user input using the  Scanner next() method to take the text into a String variable
//Write a method to return the characters in a string without using the toCharArray()
//Write a method to compare two string arrays and return a boolean result
//In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result

import java.util.Scanner;

public class CharArrayComparison {
    static char[] manualToCharArray(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] manual = manualToCharArray(text);
        char[] builtin = text.toCharArray();

        System.out.println("Comparison result: " + compareArrays(manual, builtin));
    }
}
