package Java;

import java.util.Arrays;

public class HomeWork03 {
    public static void main(String[] args) {
        int c = 4;
        int[][] matr = new int[c][c];
        int value = 0;
        int count = 0;
        int collumn = 0;
        int line = 0;
        for (int k = 0; value < c*c-1; k++) {
            for (int j = 0; j < matr.length - count; j++) {
                matr[line][collumn++] = ++value;
            }
            collumn--;
            ++count;
            for (int j = 0; j < matr.length - count; j++) {
                matr[++line][collumn] = ++value;
            }
            for (int j = 0; j < matr.length - count; j++) {
                matr[line][--collumn] = ++value;
            }
            count++;
            for (int j = 0; j < matr.length - count; j++) {
                matr[--line][collumn] = ++value;
            }
            collumn++;
        }
        for (int i = 0; i < c ; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

