package Level1;
// Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
// Hint => 
// Create a variable counter to take user inputted value for the countdown.
// Use the while loop to check if the counter is 1
// Inside a while loop, print the value of the counter and decrement the counter.

public class Level1Q8 {
    public static void main(String[] args) {
        int counter = 10; 
        while (counter > 0) {
            System.out.println("Countdown: " + counter);
            counter--; 
        }
        System.out.println("Liftoff!");
    }
}
