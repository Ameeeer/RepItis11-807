package Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        String arr1 = "", arr2 = "";
        for (int i = 0; i < m; i++) {
            arr1 += sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
            arr2 += sc.nextInt();
        }
        System.out.println(arr2.indexOf(arr1));
    }
}
