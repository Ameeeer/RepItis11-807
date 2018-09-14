package Java;

import java.util.Scanner;

public class MaxModuleEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (Math.abs(arr[i]) > Math.abs(x)) {
                x = arr[i];
                y = i;
            }
        }
        System.out.println("Индекс = " + y);
    }
}
