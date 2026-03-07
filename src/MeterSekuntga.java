public class MeterSekuntga {
    public static void main(String[] args) {
        System.out.println(kmhToMs(72));
    }
    public static double kmhToMs(double speed) {
        return speed / 3.6;
    }
}
