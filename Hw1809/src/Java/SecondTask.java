package Java;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            str += str.charAt(str.length());
            str = str.substring(str.length()-1);
        }
        System.out.println(str);
    }
}