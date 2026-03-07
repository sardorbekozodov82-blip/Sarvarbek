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

public class Main {
    public static void main(String[] args) {
        System.out.println(kmhToMs(72));
    }
    public static double kmhToMs(double speed) {
        return speed / 3.6;
    }
}