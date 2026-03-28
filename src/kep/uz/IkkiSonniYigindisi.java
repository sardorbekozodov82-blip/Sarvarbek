package kep.uz;

import java.util.Scanner;

public class IkkiSonniYigindisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();


        int b = input.nextInt();


        int yigindi = a + b;


        System.out.println(yigindi);

        input.close();
    }
}