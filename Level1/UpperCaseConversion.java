// Write a program to convert the complete text to uppercase and compare the results
//Hint =>
//Take user input using the  Scanner nextLine() method to take the complete text into a String variable
//Write a method using the String built-in charAt() method to convert each character if it is lowercase to the uppercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
//Write a method to compare two strings using the charAt() method and return a boolean result
//In the main() use the String built-in method toUpperCase() to get the uppercase text and compare the two strings using the user-defined method. And finally display the result

import java.util.Scanner;

public class UpperCaseConversion {
    static String manualUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char)(c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    static boolean compare(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String manual = manualUpper(input);
        String builtin = input.toUpperCase();

        System.out.println("Match: " + compare(manual, builtin));
    }
}

