package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IntList list = new IntArrayList();
        list.add(42);//{42}
        IntList list2 = new IntArrayList();
        list.add(45);
        list.add(44);
        list.add(459);
        System.out.println("Индекс элемента " + 42 + " = " + list.indexOf(42));
        System.out.println("Количество элементов в массиве = " + list.size());
        System.out.println("Элемент по номером " + 0 + " = " + list.get(0));
        System.out.println(list.get(1));
        list.sort();
        System.out.println(list.get(1));
    }
}
