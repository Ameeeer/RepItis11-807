package Java.StackInLinked;

import java.io.File;

public class MainTest {
    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();
        String s1 = "lock";
        String s2 = "clock";
        linkedStack.push(s2);
        linkedStack.push(s1);
        System.out.println(linkedStack.pop());
    }
}
