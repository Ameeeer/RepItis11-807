package Java;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        int rostSum = 0;
        for (int i = 0; i < n; i++) {
            rostSum += height[i];
        }
        double srRost = rostSum / n;
        int countOfStudentsUnderSrRost = 0;
        for (int i = 0; i < n; i++) {
            if (srRost < height[i]) {
                countOfStudentsUnderSrRost++;
            }
        }
        System.out.println("Средний рост = " + srRost +
                " " + "Количество студ. выше среднего = " + countOfStudentsUnderSrRost);
    }
}
