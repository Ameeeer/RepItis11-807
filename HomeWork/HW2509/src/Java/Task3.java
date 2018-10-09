package Java;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {0, 5, 5, 8, 5, 7, 7, 7, 11};
        rowNum(arr);
    }

    static void rowNum(int[] arr) {
        int count = 1;
        int max = -1;
        for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] == arr[i+1]) {
                    count++;
                } else if (max < count) {
                    max = count;
                    count = 1;
            }
        }
        System.out.println(max);
    }
}

