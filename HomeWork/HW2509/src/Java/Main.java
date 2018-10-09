package Java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] str = {"abcd", "ef", "123567", "fifty"};
        Sort(str);
        System.out.println(Arrays.toString(str));
    }

    static void Sort(String[] str) {
        for (int i = str.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    String buf = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = buf;
                }
            }
        }
    }
}

