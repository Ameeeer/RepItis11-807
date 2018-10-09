package Java;
public class Polindrome {
    public static void main(String[] args) {
        String s = "abcba";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            char buf = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i -1] = buf;
        }
        String k = String.valueOf(chars);
        if (k.equals(s)){
            System.out.println("Полиндром");
        }
    }
}
