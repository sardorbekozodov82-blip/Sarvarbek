import java.util.Scanner;

public class ShilliQyrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int a = input.nextInt();

        if (m >= n){
            System.out.println(1);
        }else {
            int d = m-a;
            int s =(n - m )/d + 1;
            System.out.println(s);
        }
    }
}