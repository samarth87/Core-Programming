import java.util.Scanner;

public class Level2Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive number less than 100.");
        } else {
            int i = 1;
            while (i < 100) {
                if (i % number == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }

        sc.close();
    }
}
