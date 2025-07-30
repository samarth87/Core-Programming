package Level1;
import java.util.Scanner;

public class Level1Q4 {
    public static int checkSign(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = checkSign(num);
        if (result == 1) System.out.println("Number is Positive");
        else if (result == -1) System.out.println("Number is Negative");
        else System.out.println("Number is Zero");
    }
}
