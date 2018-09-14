package Java;

public class LocalMax {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();*/
        int[] arr = {1, 20, 10, 5, 100, 15};
        /*for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }*/
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j += 1) {
                for (int k = 0; k < 3; k += 2) {
                    if (arr[i] < arr[j] && arr[j] > arr[k]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}


