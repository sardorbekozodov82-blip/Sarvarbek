package kep.uz;

import java.util.Scanner;

public class NollarSoni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLong()) {
            long n = scanner.nextLong();


            if (n == 0) {
                System.out.println(1);
                return;
            }

            int count = 0;


            while (n > 0 && n % 10 == 0) {
                count++;
                n /= 10;
            }

            System.out.println(count);
        }

        scanner.close();
    }
}