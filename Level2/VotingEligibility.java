// Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
//Hint =>
//Create a method to define the random 2-digit age of several students provided as method parameters and return a 1D array of ages of n students
//Create a method that takes an array of age as a parameter and returns a 2D String array of age and a boolean true or false to indicate can and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to set true to indicate can vote.
//Create a method to display the 2D array in a tabular format.
//Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] data = new String[5][2];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of person " + (i + 1) + ": ");
            data[i][0] = sc.nextLine();
            System.out.print("Enter age of " + data[i][0] + ": ");
            int age = sc.nextInt();
            sc.nextLine(); // clear buffer
            data[i][1] = age >= 18 ? "Eligible" : "Not Eligible";
        }

        System.out.println("\nName\t\tStatus");
        for (int i = 0; i < 5; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }
}
