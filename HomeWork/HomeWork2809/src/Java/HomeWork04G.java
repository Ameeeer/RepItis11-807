package Java;

public class HomeWork04G {
    public static void main(String[] args) {
        System.out.print(outOfelemsToRight(123));
    }

    static String outOfelemsToRight(int x) {
        if (x / 1 == 0) {
            return String.valueOf(0);
        } else {
            return outOfelemsToRight(x/10) + " " + x%10;
        }
    }

}
