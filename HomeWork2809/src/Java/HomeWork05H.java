package Java;

public class HomeWork05H {
    public static void main(String[] args) {
        System.out.println(checkSimpleNum(11,2));
    }

    static boolean checkSimpleNum(int x, int k) {
        if (x < 2) {
            return false;
        } else {
            if (x == 2) {
                return true;
            }
            if (x % k == 0) {
                return false;
            } else {
                if (k <= x / 2) {
                    return checkSimpleNum(x, k + 1);
                } else {
                    return true;
                }
            }
        }
    }
}
