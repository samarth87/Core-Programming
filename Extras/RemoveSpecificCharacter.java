// Remove a Specific Character from a String
//Problem:
//Write a Java program to remove all occurrences of a specific character from a string. Example Input:
//String: "Hello World"
//Character to Remove: 'l'
//Expected Output:
//Modified String: "Heo Word"

import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        System.out.println("Enter the character to remove:");
        char chToRemove = sc.next().charAt(0);

        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch != chToRemove) {
                result.append(ch);
            }
        }

        System.out.println("Modified string: " + result.toString());
        sc.close();
    }
}
