//package kep.uz;
//
//public class XonaliSonniTopish {
//    public static void main(String[] args) {
//
//        for (int i = 1000; i <= 9999; i++) {
//            if (isFourTimesGreaterWhenReversed(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//
//
//    public static boolean isFourTimesGreaterWhenReversed(int num) {
//        int originalNum = num;
//        int reversedNum = 0;
//        int temp = num;
//
//
//        while (temp > 0) {
//            reversedNum = reversedNum * 10 + (temp % 10);
//            temp /= 10;
//        }
//
//
//        return reversedNum == originalNum * 4;
//    }
//}
//
//
//
//
//add() Roʻyxat oxiriga element qoʻshadi
//get() Belgilangan pozitsiyadagi elementni qaytaradi
//set() Elementni belgilangan joyga almashtiradi
//remove() Belgilangan joydagi elementni olib tashlaydi
//size() Roʻyxatdagi elementlar sonini qaytaradi


import java.util.Scanner;

public class XonaliSonniTopish {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int natija = k / n;

            System.out.println(natija);
        }

        sc.close();
    }
}