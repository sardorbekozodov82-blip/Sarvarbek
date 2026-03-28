package kep.uz;

import java.util.Scanner;
public class OhirgiIkkitaSon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sonni kiriting: ");
        int n = sc.nextInt();


        int birlar = Math.abs(n % 10);


        int onlar = Math.abs((n / 10) % 10);


        System.out.println(onlar + " " + birlar);

        sc.close();
    }
}