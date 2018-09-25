package Java;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4 ,5 ,1 ,6};
        bbSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bbSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    int buf = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buf;
                }
            }
        }
    }
}
