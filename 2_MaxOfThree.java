import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = getInput(scanner, "Enter first number: ");
        int b = getInput(scanner, "Enter second number: ");
        int c = getInput(scanner, "Enter third number: ");
        int max = findMax(a, b, c);
        System.out.println("Maximum number is: " + max);
    }

    public static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
