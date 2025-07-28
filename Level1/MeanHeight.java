package JAVA_ARRAYS.Level1;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " in cm: ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.println("\nMean height of the football team is: " + mean + " cm");
    }
}
