package Java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 0, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            int indexOfmax = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[indexOfmax] < arr[j]) {
                    indexOfmax = j;
                }
            }
            int buf = arr[indexOfmax];
            arr[indexOfmax] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = buf;
        }
        System.out.println(Arrays.toString(arr));
    }
}
