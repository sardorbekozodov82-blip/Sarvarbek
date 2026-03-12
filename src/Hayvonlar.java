class Gosht{
    void eat() {
        System.out.println("Hayvon ovqat yeydi");
    }
}


class Dog extends Gosht {
    void bark() {
        System.out.println("It vov-vov qiladi");
    }
}

public class Hayvonlar {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}