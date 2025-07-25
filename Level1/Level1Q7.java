package Level1;
//Write a program SpringSeason that takes two int values month and day from the command line and prints Its a Spring Season otherwise prints Not a Spring Season 
//Hint => 
//Spring Season is from March 20 to June 20 take input from the user and check if the month is between 3 and 6 and day is between 20 and 31 for March, April, May and June respectively.

import java.util.Scanner;

public class Level1Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input month and day from user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        boolean isSpring = false;

        // Check conditions based on month and valid day ranges
        if (month == 3 && day >= 20 && day <= 31) {
            isSpring = true;
        } else if (month == 4 && day >= 1 && day <= 30) {
            isSpring = true;
        } else if (month == 5 && day >= 1 && day <= 31) {
            isSpring = true;
        } else if (month == 6 && day >= 1 && day <= 20) {
            isSpring = true;
        }

        // Output result
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        scanner.close();
    }
}
