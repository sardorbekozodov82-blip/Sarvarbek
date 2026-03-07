public class JuftToq {
    public static void main(String[] args) {
        System.out.println(juftYokiToq(6));
    }
    public static String juftYokiToq(int son){
        if(son%2==0){
            return "Juft";
        }
        return "Toq";
    }
}
