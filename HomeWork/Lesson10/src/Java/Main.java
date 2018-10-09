package Java;

public class Main {

    public static void main(String[] args) {
        int[][] matr = new int[4][4];
        spiralFill(matr);
        int[][] eMatrix = new int[matr.length][matr.length]
        eMatrix(eMatrix);

    }

    static void spiralFill(int[][] matr) {
        int n = matr.length;
        int value = 0;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                matr[i][j] = ++value;
            }
            for (int j = i; j < n - i - 1; j++) {
                matr[j][n - 1 - i] = ++value;
            }
            for (int j = n - 1 - i; j > i; j--) {
                matr[n - 1 - i][j] = ++value;
            }
            for (int j = n - 1 - i; j > i; j--) {
                matr[j][i] = ++value;
            }
        }
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                System.out.print(matr[i][j] + "\t\t");
            }
            System.out.println();
        }

    }

    static void multiply(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    }

    static void eMatrix(int[][] eMatrix) {
        for (int i = 0; i < eMatrix.length; i++) {
            eMatrix[i][i] = 1;
        }
    }

    static void printMatrix(int[][] matrixForPrint) {
        for (int i = 0; i < ; i++) {
            for (int j = 0; j < ; j++) {
                
            }
        }
    }
}

