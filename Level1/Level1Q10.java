package Level1;
import java.util.Scanner;

public class Level1Q10 {
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double temp = sc.nextDouble();
        System.out.print("Enter wind speed in mph: ");
        double wind = sc.nextDouble();

        double windChill = calculateWindChill(temp, wind);
        System.out.printf("Wind Chill Temperature: %.2f°F\n", windChill);
    }
}
