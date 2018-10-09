package Java;

import java.util.Arrays;

public class HomeWork02 {
    public static void main(String[] args) {
        int[][] matr = {{1, 2, 50,30}, {15, 5, 6,40}, {2, 10, 11,0}, {12, 40, 30,-100}};
        int buf = 0;
        int[] max1 = new int[matr[0].length];
        for (int i = 0; i < matr.length; i++) {
            int[] arrMaxLine= new int[matr[0].length];
            int sum1 = 0;
            for (int j = 0; j < matr[0].length; j++) {
                arrMaxLine[j] = matr[i][j];
                sum1 += matr[i][j];
            }
            if (buf < sum1) {
                buf = sum1;
                max1 = arrMaxLine;
            }
        }
        int buf2 = 0;
        int[] max2 = new int[matr.length];
        for (int i = 0; i < matr[0].length; i++) {
            int[] arrMaxcollumn = new int[matr.length];
            int sum2 = 0;
            for (int j = 0; j < matr.length; j++) {
                arrMaxcollumn[j] = matr[j][i];
                sum2 += matr[j][i];
            }
            if (buf2 < sum2) {
                buf2 = sum2;
                max2 = arrMaxcollumn;
            }
        }
        System.out.println("Max Line= " + Arrays.toString(max1));
        System.out.println("Max collumn = " + Arrays.toString(max2));
    }
}
