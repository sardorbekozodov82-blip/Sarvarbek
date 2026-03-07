//package oop;
//
//public class CarModels {
//    public static void main(String[] args) {
//        CarModels q = new CarModels();
//        q.yozuv();
//    }
//
//    Daftar notebook = new Daftar();
//
//    public void yozuv() {
//        notebook.type = " yo'l yo'l daftar ";
//        notebook.pageNumber = 36 ;
//        notebook.color = " oq qora ";
//
//        notebook.country = " Uzbekistan";
//
//        System.out.println(notebook.pageNumber +
//                " betli " + notebook.color +
//                " rangdagi " + notebook.type +
//                " " + notebook.country + "da ishlab chiqarilgan ");
//    }
//}


package oop;

public class CarModels {
    public static void main(String[] args){
        Car car = new Car();
        Car car1 = new Car("black","gentra");
    }
}