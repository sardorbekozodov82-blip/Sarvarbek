import java.util.Scanner;

public class IkkiBandit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int l = sc.nextInt();

        System.out.println((l - 1) + " " + (h - 1));
    }
}