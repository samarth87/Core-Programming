package Java_Methods.Level3;

import java.util.Scanner;

public class LineEquation {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        if (x1 == x2) {
            System.out.println("The line is vertical. Slope is undefined.");
            result[0] = Double.POSITIVE_INFINITY;
            result[1] = Double.NaN;
            return result;
        }
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        result[0] = m;
        result[1] = b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        double[] line = calculateLineEquation(x1, y1, x2, y2);
        double m = line[0];
        double b = line[1];

        if (!Double.isInfinite(m)) {
            System.out.printf("Equation of the Line: y = %.2fx + %.2f\n", m, b);
        }
    }
}
