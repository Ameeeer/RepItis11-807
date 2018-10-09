package Java;

import java.util.Arrays;

//Вариант 2
public class ClassTestTask01 {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }*/
        int[] arr = {101, 202, 300};
        int sum = 0;
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(getSideDiagonalAsVector(matrix)));
        //System.out.println(Arrays.toString(mult(matrix, arr)));

    }

    static int[] getSideDiagonalAsVector(int[][] matrix) { //Вывод матрицы побочной диагонали
        int[] matrixDiag = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                matrixDiag[i] = matrix[i][j];
                i++;
            }
        }
        return matrixDiag;
    }

    static int[] mult(int[][] matrix, int[] arr) {
        int[] result = new int[arr.length];
        if (matrix.length != arr.length) { //Проверяет возможны ли условия умножения
            System.out.println("Not corrected");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    for (int k = 0; k < arr.length; k++) {
                        result[k] += matrix[k][j] * arr[k];
                    }
                }
            }
        }
        return result;
    }

    static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (sumOfRecurs(arr[j]) < sumOfRecurs(arr[j+1])) {
                    int buf = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = buf;
                }
            }
        }
    }

    static int sumOfRecurs(int arrNum) {
        int sum = 0;
        while (arrNum > 0){
            sum+=arrNum%10;
            arrNum = arrNum/10;
        }
        return sum;
        /*if (arrNum / 1 == 0) {
            return 0;
        } else {
            arrNum = arrNum/10;
           sumOfRecurs(sum+=arrNum%10);
        }
        return sum;*/
    }
}
