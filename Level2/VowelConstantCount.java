import java.util.Scanner;

public class VowelConstantCount {
    static int getLength(String s) {
        int count = 0;
        try { while (true) s.charAt(count++); }
        catch (Exception e) { return count; }
    }

    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int len = getLength(text);
        int vowels = 0, consonants = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (isVowel(ch)) vowels++;
                else consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

