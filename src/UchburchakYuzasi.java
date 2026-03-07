public class UchburchakYuzasi {
    public static void main(String[] args) {
        System.out.println(yuza(7, 8, 9));
    }
    public static double yuza(double a, double b, double c){
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
