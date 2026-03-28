package kep.uz;

import java.util.Scanner;

public class OhirgiIkkita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();


            int[] numbers = new int[n];


            for (int i = 0; i < n; i++) {
                if (scanner.hasNextInt()) {
                    numbers[i] = scanner.nextInt();
                }
            }


            System.out.print(numbers[n - 2] + " " + numbers[n - 1]);
        }

        scanner.close();
    }
}