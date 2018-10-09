package Java;

import java.util.Scanner;

public class HomeWork01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isMagic = true;
        int[][] matr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = sc.nextInt();
            }
        }
        int diagSum = 0;
        for (int i = 0; i < n; i++) {
            diagSum += matr[i][i];
        }
        int collAlterDiagSum = 0;
        for (int i = 0; i < n; i++) {
            collAlterDiagSum += matr[i][n - i - 1];
        }
        if (diagSum != collAlterDiagSum) {
            isMagic = false;
        }
        for (int i = 0; i < matr[0].length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matr.length; j++) {
                rowSum += matr[i][j];
            }
            if (diagSum != rowSum) {
                isMagic = false;
            }
        }
        for (int i = 0; i < matr.length; i++) {
            int rowSum2 = 0;
            for (int j = 0; j < matr[0].length; j++) {
                rowSum2 += matr[j][i];
            }
            if (diagSum != rowSum2) {
                isMagic = false;
            }
        }
        if (isMagic == true) {
            System.out.println("Magic");
        } else {
            System.out.println("NotMagic");
        }
    }
}
