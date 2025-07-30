package Level2;
import java.util.Scanner;

public class Level2Q3 {
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid year. Year must be >= 1582.");
        } else if (isLeapYear(year)) {
            System.out.println("The Year is a Leap Year.");
        } else {
            System.out.println("The Year is not a Leap Year.");
        }
    }
}
