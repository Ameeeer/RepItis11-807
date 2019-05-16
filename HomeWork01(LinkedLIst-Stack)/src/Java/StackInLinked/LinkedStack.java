package Java.StackInLinked;

public class LinkedStack<T> implements Stack<T> {
    private Node head;
    private int size;

    private class Node {
        T t;
        Node next;
    }

    public LinkedStack() {
        head = null;
        size = 0;
    }

    @Override
    public T pop() {
        T t = head.t;
        head = head.next;
        size--;
        return t;
    }

    @Override
    public void push(T t) {
        Node oldHead = head;
        head = new Node();
        head.t = t;
        head.next = oldHead;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
