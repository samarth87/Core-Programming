package Level3;
import java.util.Scanner;

public class Level3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = scanner.nextInt();

        double average = (physics + chemistry + maths) / 3.0;
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A (Excellent)");
        } else if (average >= 75) {
            System.out.println("Grade: B (Good)");
        } else if (average >= 60) {
            System.out.println("Grade: C (Average)");
        } else if (average >= 40) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        scanner.close();
    }
}
