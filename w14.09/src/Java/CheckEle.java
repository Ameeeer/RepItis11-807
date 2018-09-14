package Java;

public class CheckEle {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 11, 133};
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
        int x = Integer.parseInt(str);
        System.out.println(x);
    }
}
