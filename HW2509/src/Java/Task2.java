package Java;

public class Task2 {
    public static void main(String[] args) {
        String str = " abcde";
        SpaceDel(str);
    }

    static void SpaceDel(String str) {
        char[] chars2 = str.toCharArray();
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (chars2[i] != ' ') {
                s = s + chars2[i];
            }
        }
        System.out.println(s);
    }
}
