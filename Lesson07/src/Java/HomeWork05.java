package Java;

public class HomeWork05 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 4},{2,0,3}};
        int[][] matrix2 = {{2,5},{1,3},{1,1}};
        matrixMultiply(matrix1,matrix2);
    }

    static void matrixMultiply(int[][] matrix1, int[][] matrix2) {
        if (matrix2.length != matrix1[0].length) {
            System.out.println("Not corrected");
        }else {
            int[][] result = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix2.length; k++) {
                        result[i][j] += matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
            for (int i = 0; i < result.length ; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.print(result[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
}
