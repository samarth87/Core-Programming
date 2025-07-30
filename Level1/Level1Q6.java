package Level1;
import java.util.Scanner;

public class Level1Q6 {
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = sumNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
