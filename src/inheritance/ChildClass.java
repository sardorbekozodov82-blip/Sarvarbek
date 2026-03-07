package inheritance;

public class ChildClass extends Inherit{

    public static void main(String[] args) {
        Inherit myObj = new Inherit();
        myObj.surname="Ozodov";
        System.out.println(myObj.surname);
        System.out.printf(myObj.name("Sarvarbek"));
    }
}
