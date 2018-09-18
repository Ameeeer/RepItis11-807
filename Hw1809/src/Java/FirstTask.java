package Java;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int k = sc.nextInt();
        int[] arr2 = new int[k];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
            arr2[i] = sc.nextInt();
        }
        int indexArr = 0;
        boolean mark = true;
        for (int i = 0; i < n & mark; i++) {
            for (int j = 0; j < k & mark; i++) {
                if (arr1[i] == arr2[j]) {
                    indexArr = i;
                    mark = false;
                }
            }
        }
        System.out.println(indexArr);
    }
}
