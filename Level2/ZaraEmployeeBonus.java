package JAVA_ARRAYS.Level2;

import java.util.*;

public class ZaraEmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Salary: ");
            double s = scanner.nextDouble();
            System.out.print("Years of Service: ");
            double y = scanner.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Salary must be > 0 and Years of Service ≥ 0. Try again.\n");
                i--;
                continue;
            }
            salary[i] = s;
            yearsOfService[i] = y;
        }
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\n--- Zara Employee Bonus Summary ---");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }
        System.out.println("\nTotal Bonus Paid by Zara: ₹" + totalBonus);
        System.out.println("Total Old Salary of all Employees: ₹" + totalOldSalary);
        System.out.println("Total New Salary of all Employees: ₹" + totalNewSalary);
    }
}
