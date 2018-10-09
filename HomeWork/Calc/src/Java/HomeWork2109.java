package Java;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9'){
                chars[i] = (char) 42;
            }
        }
        System.out.println(Arrays.toString(chars));
    }
}
