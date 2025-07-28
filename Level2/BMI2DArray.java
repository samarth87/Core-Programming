package JAVA_ARRAYS.Level2;

import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();
        double[][] personData = new double[n][3];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight for person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble() / 100;
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 24.9) status[i] = "Normal";
            else if (bmi < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        System.out.println("\nWeight(kg)  Height(m)  BMI     Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f        %.2f       %.2f   %s%n",
                    personData[i][0], personData[i][1], personData[i][2], status[i]);
        }
    }
}
