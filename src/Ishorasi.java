public class Ishorasi {
    public static void main(String[] args) {
        String sss = ishorasi(495);
        System.out.println(sss);
    }
    public static String ishorasi(int sss) {
        String ishorasi;
        if (sss >= 0) {
            ishorasi = "pilus";
        } else
            ishorasi = "minus";
        return ishorasi;
    }
}
