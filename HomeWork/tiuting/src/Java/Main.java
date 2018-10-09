package Java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int c = arr.length;
        for (int i = 0; i < arr.length/2; i++) {
            int buf = arr[arr.length -i - 1];
            arr[arr.length -i - 1]= arr[i];
            arr[i] = buf;
        }
        System.out.println(Arrays.toString(arr));
    }
}
