package kep.uz;

public class Sovga {
    public static void main(String[] args) {
        int randomValue = getRandomValue(1, 10);
        System.out.println(randomValue);
    }

    private static int getRandomValue(int i, int i1) {
        return (int) (Math.random() * (i1 - i + 1) + i);
    }

}