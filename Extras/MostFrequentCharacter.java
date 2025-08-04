//  Find the Most Frequent Character
//Problem:
//Write a Java program to find the most frequent character in a string. Example Input:
//String: "success"
//Expected Output:
//Most Frequent Character: 's'

import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int[] freq = new int[256]; // ASCII size

        for (char ch : input.toCharArray()) {
            freq[ch]++;
        }

        char mostFreqChar = ' ';
        int max = 0;

        for (char ch : input.toCharArray()) {
            if (freq[ch] > max) {
                max = freq[ch];
                mostFreqChar = ch;
            }
        }

        System.out.println("Most frequent character: '" + mostFreqChar + "'");
        sc.close();
    }
}
