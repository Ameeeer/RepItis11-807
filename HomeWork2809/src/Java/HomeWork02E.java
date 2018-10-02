package Java;

public class HomeWork02E {
    public static void main(String[] args) {
        System.out.println(sumOfelems(0,101));
    }

    static int sumOfelems(int Sum, int x) {
        if (x/1 == 0){
        } else {
            return sumOfelems(Sum+=x%10,x/=10);
        }
        return Sum;
    }
}
