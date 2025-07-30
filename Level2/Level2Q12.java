package Level2;
import java.util.Arrays;

public class Level2Q12 {
    public static int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = 1000 + (int)(Math.random() * 9000); // 1000 to 9999
        }
        return array;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }

        double avg = sum / (double)numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.println("Generated Numbers: " + Arrays.toString(numbers));

        double[] result = findAverageMinMax(numbers);
        System.out.printf("Average: %.2f\nMinimum: %.0f\nMaximum: %.0f\n", result[0], result[1], result[2]);
    }
}
