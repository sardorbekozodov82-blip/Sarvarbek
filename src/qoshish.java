import java.util.Scanner;

public class qoshish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long sum;

        if (n > 0) {
            sum = n * (n + 1) / 2;
            System.out.println(sum);
        } else {
            sum = (n - 2) * (n + 1) * (-1) / 2;
            System.out.println(sum);
        }
    }
}




