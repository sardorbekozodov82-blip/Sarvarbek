package kep.uz;

public class XonaliSonniTopish {
    public static void main(String[] args) {

        for (int i = 1000; i <= 9999; i++) {
            if (isFourTimesGreaterWhenReversed(i)) {
                System.out.println(i);
            }
        }
    }


    public static boolean isFourTimesGreaterWhenReversed(int num) {
        int originalNum = num;
        int reversedNum = 0;
        int temp = num;


        while (temp > 0) {
            reversedNum = reversedNum * 10 + (temp % 10);
            temp /= 10;
        }


        return reversedNum == originalNum * 4;
    }
}