import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.println("Choose operation: +, -, *, /");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result: " + add(a, b)); break;
            case '-': System.out.println("Result: " + subtract(a, b)); break;
            case '*': System.out.println("Result: " + multiply(a, b)); break;
            case '/': System.out.println("Result: " + divide(a, b)); break;
            default: System.out.println("Invalid operation");
        }
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y != 0) return x / y;
        else {
            System.out.println("Division by zero!");
            return 0;
        }
    }
}
