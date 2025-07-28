package JAVA_ARRAYS.Level2;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int phy, chem, math;
            do {
                System.out.println("\nEnter marks for Student " + (i + 1));
                System.out.print("Physics: "); phy = sc.nextInt();
                System.out.print("Chemistry: "); chem = sc.nextInt();
                System.out.print("Maths: "); math = sc.nextInt();
            } while (phy < 0 || chem < 0 || math < 0);
            double percent = (phy + chem + math) / 3.0;
            char grade;
            String remark;

            if (percent >= 80)      { grade = 'A'; remark = "Level 4"; }
            else if (percent >= 70) { grade = 'B'; remark = "Level 3"; }
            else if (percent >= 60) { grade = 'C'; remark = "Level 2"; }
            else if (percent >= 50) { grade = 'D'; remark = "Level 1"; }
            else if (percent >= 40) { grade = 'E'; remark = "Level 1-"; }
            else                    { grade = 'R'; remark = "Remedial"; }

            System.out.printf("Percentage: %.2f%% | Grade: %c | Remark: %s\n", percent, grade, remark);
        }
    }
}
