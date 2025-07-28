package JAVA_ARRAYS.Level2;

import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // [students][0:phy, 1:chem, 2:math]
        double[] percentages = new double[n];
        char[] grades = new char[n];
        String[] remarks = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                String subject = j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths";
                do {
                    System.out.print(subject + ": ");
                    marks[i][j] = sc.nextInt();
                } while (marks[i][j] < 0);
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 80)      { grades[i] = 'A'; remarks[i] = "Level 4"; }
            else if (percentages[i] >= 70) { grades[i] = 'B'; remarks[i] = "Level 3"; }
            else if (percentages[i] >= 60) { grades[i] = 'C'; remarks[i] = "Level 2"; }
            else if (percentages[i] >= 50) { grades[i] = 'D'; remarks[i] = "Level 1"; }
            else if (percentages[i] >= 40) { grades[i] = 'E'; remarks[i] = "Level 1-"; }
            else                           { grades[i] = 'R'; remarks[i] = "Remedial"; }
        }
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: Physics=%d, Chemistry=%d, Maths=%d | Percentage=%.2f%% | Grade=%c | Remark=%s\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i], remarks[i]);
        }
    }
}
