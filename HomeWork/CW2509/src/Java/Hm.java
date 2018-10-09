package Java;

public class Hm {

    public static void main(String[] args) {
        aToB(100,2);
    }

    static void aToB(int a, int b) {
        if (a == b) {
        }
        if (a > b) {
            System.out.println(a);
            aToB(a - 1, b);
        }
        if (a < b) {
            System.out.println(a-1);
            aToB(a + 1, b);
        }

    }
}
