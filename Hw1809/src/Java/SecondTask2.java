package Java;


import org.junit.Ass;
import org.testng.Assert;


import java.util.Scanner;

public class SecondTask2 {
    public static char[] shiftLeft(char[] arr1, int shift) {
        if (arr1 != null) {
            int length = arr1.length;
            char[] arr2 = new char[length];
            System.arraycopy(arr1, shift, arr2, 0, length - shift);
            System.arraycopy(arr1, 0, arr2, length - shift, shift);
            return arr2;
        } else {
            return null;
        }
    }
    public  void test(){
        String str = "abcde";
        char[] arr1 = str.toCharArray();
        Assert.assertArrayEq
    }

    public static void main(String[] args) {

    }
}
