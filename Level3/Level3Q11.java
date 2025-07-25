package Level3;
public class Level3Q11 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide 3 arguments: month day year");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        int dayOfWeek = (h + 6) % 7;  // Adjusted to make 0 = Sunday

        System.out.println("Day of the week: " + dayOfWeek);
    }
}
