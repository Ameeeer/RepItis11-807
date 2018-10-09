package Java;

public class HomeWork03F {
    public static void main(String[] args) {
        outOfelem(123);
    }

    static int outOfelem(int x) {
        if (x / 1 == 0) {
            return 0;
        } else {
            System.out.println(x%10);
            return outOfelem(x/10);
        }
    }
}
