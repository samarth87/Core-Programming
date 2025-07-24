package Level1;

import java.util.*;

public class PenDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of pens: ");
        int totalPens = input.nextInt();
        System.out.print("Enter total number of students: ");
        int totalStudents = input.nextInt();
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;
        System.out.println("The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens);
    }
}
