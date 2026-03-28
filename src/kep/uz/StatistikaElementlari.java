package kep.uz;

import java.util.Scanner;

public class StatistikaElementlari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double arifmetik = (a + b) / 2;
        double geometrik = Math.sqrt(a * b);
        double garmonik = (2 * a * b) / (a + b);

        System.out.println(arifmetik);
        System.out.println(geometrik);
        System.out.println(garmonik);
    }
}