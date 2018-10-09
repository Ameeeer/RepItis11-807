package Java;

import java.util.Arrays;
import java.util.Scanner;

public class inversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < x / 2; i++) {
            int buf = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = buf;
        }
        System.out.println(Arrays.toString(arr));

    }
}
