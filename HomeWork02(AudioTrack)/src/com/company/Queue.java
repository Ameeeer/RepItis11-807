package com.company;

public class Queue<T> {
    Node<T> first;
    Node<T> last;

    void enqueue(T elem) {
        Node<T> oldLast = last;
        last = new Node<>();
        last.item = elem;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    T dequeue() {
        Node<T> node = first;
        first = first.next;
        return (T) node.item;
    }

    boolean isEmpty() {
        return first == null;
    }

    class Node<Item> {
        Item item;
        Node<Item> next;
    }
}
