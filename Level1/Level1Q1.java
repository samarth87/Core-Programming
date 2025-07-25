package Level1;
// Write a program to check if a number is divisible by 5
// I/P => number
// O/P => Is the number ___ divisible by 5? ___

public class Level1Q1 {
    public static void main(String[] args) {
        int number = 25; 
        boolean isDivisible = (number % 5 == 0);

        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }
}
