package com.company;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst =
                new BinarySearchTreeImpl<>();
        bst.insert(12);
        bst.insert(15);
        bst.insert(11);
        bst.insert(14);
        bst.insert(16);
        bst.insert(13);
        bst.insert(17);
        bst.insert(20);
        bst.insert(21);
        bst.printAll();
    }
}
