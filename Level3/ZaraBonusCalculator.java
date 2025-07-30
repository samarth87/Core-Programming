package Java_Methods.Level3;

import java.util.Random;

public class ZaraBonusCalculator {
    public static int[][] generateEmployeeData(int employeeCount) {
        int[][] data = new int[employeeCount][2];
        Random rand = new Random();
        for (int i = 0; i < employeeCount; i++) {
            int salary = 10000 + rand.nextInt(90000);
            int years = rand.nextInt(11);
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] results = new double[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            results[i][0] = bonus;
            results[i][1] = newSalary;
        }
        return results;
    }

    public static void displaySummary(int[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;
        System.out.printf("%-5s %-10s %-10s %-10s %-12s\n", "Emp#", "Salary", "Years", "Bonus", "New Salary");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];
            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
            System.out.printf("%-5d %-10d %-10d %-10.2f %-12.2f\n", i + 1, salary, years, bonus, newSalary);
        }
        System.out.println("----------------------------------------------------------");
        System.out.printf("Total  %-10.0f %-10s %-10.2f %-12.2f\n", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int employeeCount = 10;
        int[][] employeeData = generateEmployeeData(employeeCount);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, bonusData);
    }
}
