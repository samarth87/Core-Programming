public class Level2Q3 {
    static class PalindromeChecker {
        String text;

        PalindromeChecker(String text) {
            this.text = text;
        }

        boolean isPalindrome() {
            String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int left = 0, right = cleaned.length() - 1;
            while (left < right) {
                if (cleaned.charAt(left++) != cleaned.charAt(right--)) {
                    return false;
                }
            }
            return true;
        }

        void displayResult() {
            System.out.println("Text: " + text);
            System.out.println("Is Palindrome? " + (isPalindrome() ? "Yes" : "No"));
        }
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("Madam");
        checker.displayResult();
    }
}
