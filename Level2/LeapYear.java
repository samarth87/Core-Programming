package Java_Methods.Level2;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (≥ 1582): ");
        int year = scanner.nextInt();
        if (year < 1582) {
            System.out.println("The year is before the Gregorian calendar. Leap year check not valid.");
        } else if (isLeapYear(year)) {
            System.out.println("The year " + year + " is a Leap Year.");
        } else {
            System.out.println("The year " + year + " is NOT a Leap Year.");
        }
    }
}
