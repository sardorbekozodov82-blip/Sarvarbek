import java.util.Arrays;

public class SonlarMedianasi{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        Arrays.sort(numbers);

        int n = numbers.length;
        double median;

        if (n % 2 == 1) {
            median = numbers[n / 2];
        } else {
            median = (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        }

        System.out.println("Median: " + median);
    }
}