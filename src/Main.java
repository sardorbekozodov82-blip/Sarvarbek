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
//
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int m = input.nextInt();
//        int a = input.nextInt();
//
//        if (m<=n){
//            System.out.println(1);
//        }else {
//            int d = m-a;
//            int s =(n - m )/d + 1;
//            System.out.println(s);
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int h = sc.nextInt();
//        int l = sc.nextInt();
//
//        System.out.println((l - 1) + " " + (h - 1));
//    }
//}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int d = a/6;
//        int c = 4*d;
//        int f = d;
//        System.out.println(d+" "+c+" "+f);
//    }
//}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a-3);
//    }
//}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//    }
//}
//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] birlik = {
                "", "bir", "ikki", "uch", "to'rt",
                "besh", "olti", "yetti", "sakkiz", "to'qqiz"
        };

        String[] onlik = {
                "", "o'n", "yigirma", "o'ttiz", "qirq",
                "ellik", "oltmish", "yetmish", "sakson", "to'qson"
        };

        if (n == 1000) {
            System.out.println("bir ming");
            return;
        }

        int yuz = n / 100;
        int on = (n % 100) / 10;
        int bir = n % 10;

        String result = "";

        if (yuz > 0) {
            result += birlik[yuz] + " yuz";
        }

        if (on > 0) {
            if (!result.isEmpty()) result += " ";
            result += onlik[on];
        }

        if (bir > 0) {
            if (!result.isEmpty()) result += " ";
            result += birlik[bir];
        }

        System.out.println(result);
    }
}