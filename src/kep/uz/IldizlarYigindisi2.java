package kep.uz;

import java.util.Scanner;

public class IldizlarYigindisi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            long yigindi = 0;


            for (int i = 1; i <= n; i++) {

                int butunQism = (int) Math.sqrt(i);


                yigindi += butunQism;
            }

            System.out.println(yigindi);
        }

        sc.close();
    }
}
