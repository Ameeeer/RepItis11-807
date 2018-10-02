package Java;

public class HomeWork01D {
    public static void main(String[] args) {
        checkExpon(15);
    }

    static void checkExpon(double x) {
        if (x == 1) {
            System.out.println("yes");
        } else {
            if (x > 1 && x < 2) {
                System.out.println("no");
            } else {
                checkExpon(x / 2);
            }
        }
    }
}



