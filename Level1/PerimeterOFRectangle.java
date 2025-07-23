import java.util.Scanner;

public class PerimeterOFRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Lenght: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        double P = 2*(l+w);
        System.out.print("The Perimeter of Rectangle is: " + P);
        sc.close();
    }
}
