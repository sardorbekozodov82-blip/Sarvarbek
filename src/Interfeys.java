interface Hayvon {
    void ovozChiqar();
}
class It implements Hayvon {
    public void ovozChiqar() {
        System.out.println("Vov-vov");
    }
}
class Mushuk implements Hayvon {
    public void ovozChiqar() {
        System.out.println("Miyov");
    }
}

public class Interfeys {
    public static void main(String[] args) {
        Hayvon h1 = new It();
        Hayvon h2 = new Mushuk();

        h1.ovozChiqar();
        h2.ovozChiqar();
    }
}