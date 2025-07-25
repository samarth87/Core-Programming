package Level1;
// Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using for loop
// Compare the two results and print the result

public class Level1Q13 {
    public static void main(String[] args) {
        int number = 10; // Example input
        if (number >= 0) {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            int formulaSum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers using for loop is " + sum);
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
