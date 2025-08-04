// Write a replace method in Java that replaces a given word with another word in a sentence:

import java.util.Scanner;

public class ReplaceWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter the word to be replaced:");
        String oldWord = sc.nextLine();

        System.out.println("Enter the new word:");
        String newWord = sc.nextLine();

        String[] words = sentence.split(" ");
        StringBuilder updatedSentence = new StringBuilder();

        for (String word : words) {
            if (word.equals(oldWord)) {
                updatedSentence.append(newWord);
            } else {
                updatedSentence.append(word);
            }
            updatedSentence.append(" ");
        }

        System.out.println("Updated sentence: " + updatedSentence.toString().trim());
        sc.close();
    }
}

