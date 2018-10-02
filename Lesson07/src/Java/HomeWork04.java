package Java;

public class HomeWork04 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int rowN = sc.nextInt();
        int colN = sc.nextInt();*/
        int max = 0;
        int min = 0;
        int indexOfminRow = 0;
        int[][] matr = {{5, 6, 4}, {-2, 5, 3}, {8, 7, -2}};
        for (int i = 0; i < matr.length; i++) {
            min = matr[i][0];
            for (int j = 0; j < matr[0].length; j++) {
                if (min > matr[i][j]) {
                    min = matr[i][j];
                    indexOfminRow = j;
                }
                if (j == matr.length - 1) {
                    for (int l = 0; l < matr.length; l++) {
                        if (max < matr[l][indexOfminRow]) {
                            max = matr[l][indexOfminRow];
                            if (max == min) {
                                System.out.println(max);
                            }
                        }
                    }
                }
            }
        }
    }
}
