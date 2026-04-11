//package oop;
//
//public class Main {
//    public static void main(String[] args){
//        Car car = new Car();
//        Car car1 = new Car("black","gentra");
//    }
//}
//
//
//public class Main {
//    int modelYear;
//    String modelName;
//
//
//    public Main(String modelName) {
//
//        this(2020, modelName);
//    }
//
//    public Main(int modelYear, String modelName) {
//        this.modelYear = modelYear;
//        this.modelName = modelName;
//    }
//
//    public void printInfo() {
//        System.out.println(modelYear + " " + modelName);
//    }
//
//    public static void main(String[] args) {
//        Main car1 = new Main("Corvette");
//
//        Main car2 = new Main(1969, "Mustang");
//
//        car1.printInfo();
//        car2.printInfo();
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        System.out.println(kmToMeter(3));
//    }
//
//    public static int kmToMeter(int son) {
//        return son * 1000;
//    }
//
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(kmhToMs(72));
//    }
//    public static double kmhToMs(double speed) {
//        return speed / 3.6;
//    }
//}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//    }
//}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        if (a%2==0 ) System.out.println(a);
//        else System.out.println(a*2);
//    }
//}

//import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println(7-a);
//     }
//}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if(a==b) System.out.println("=");
//        else if (a<b) {
//            System.out.println("<");
//        }
//        else if(a>b) {
//            System.out.println(">");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long a = sc.nextLong();
//        String son = Long.toBinaryString(a);
//        int sum = Long.bitCount(a);
//        String sb = Integer.toBinaryString(sum);
//        System.out.println(son+" "+sb);
//    }
//}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int a = input.nextInt();

        if (m<=n){
            System.out.println(1);
        }else {
            int d = m-a;
            int s =(n - m )/d + 1;
            System.out.println(s);
        }
    }
}