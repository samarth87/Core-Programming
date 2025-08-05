import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        String response;
        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (respond: high, low, correct)");
            response = scanner.nextLine().toLowerCase();
            if (response.equals("correct")) {
                System.out.println("Guessed correctly!");
                break;
            } else if (response.equals("high")) {
                high = guess - 1;
            } else if (response.equals("low")) {
                low = guess + 1;
            }
        }
    }

    public static int generateGuess(int low, int high) {
        return low + (int)(Math.random() * ((high - low) + 1));
    }
}
