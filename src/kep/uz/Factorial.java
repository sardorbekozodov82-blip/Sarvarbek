package kep.uz;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (input.hasNextInt()) {
            int n = input.nextInt();

            long kopaytma = 1;

            for (int i = 1; i <= n; i++) {
                kopaytma *= i;
            }

            System.out.println(kopaytma);
        }

        input.close();
    }
}