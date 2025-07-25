package Level1;
// Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using while loop
// Compare the two results and print the result

public class Level1Q12 {
    public static void main(String[] args) {
        int number = 10;
        if (number >= 0) {
            int sum = 0;
            int i = 1;
            while (i <= number) {
                sum += i;
                i++;
            }
            int formulaSum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers using while loop is " + sum);
            System.out.println("The sum of " + number + " natural numbers using formula is " + formulaSum);
            if (sum == formulaSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is a discrepancy in the computations.");
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
