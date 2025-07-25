import java.util.Scanner;

public class Level2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int service = sc.nextInt();

        if (service > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus: ₹" + bonus);
        } else {
            System.out.println("No bonus");
        }

        sc.close();
    }
}
