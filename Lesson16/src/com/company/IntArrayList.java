package com.company;

import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public IntArrayList() {
        elements = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(int x) {
        boolean checkContain = false;
        for (int i = 0; i < count; i++) {
            if (elements[i] == x){
                return checkContain = true;
            }
        }
        return checkContain;
    }

    @Override
    public void add(int e) {
        if (capacity == count) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        return elements[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                int[] OldArray = new int[elements.length - 1];
                System.arraycopy(elements, 0, OldArray, 0, i);
                System.arraycopy(elements, i + 1, OldArray, i, elements.length - 1 - index);
                elements = OldArray;
            }
        }

    }

    @Override
    public void sort() {
        for (int i = count-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (elements[j] > elements[j+1]){
                    int buf = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = buf;
                }
            }
        }
    }

    @Override
    public void addAll(IntList intList) {
        for (int i = 0; i < intList.size(); i++) {
            elements[count++] = (intList.get(i));
            if (capacity == count) {
                grow();
            }
        }
    }

    @Override
    public void addAll(IntList intList, int startPosition) {
       /* for (int i = 0; i < intList.size(); i++) {
            if (capacity == count || startPosition >= capacity) {
                grow();
            }
            elements[startPosition] = intList.get(i);
            startPosition++;
        }*/
    }

    @Override
    public int[] toArray() {
        int[] arrToReturn = new int[count];
        System.arraycopy(elements,0,arrToReturn,0,count);
        return arrToReturn;
    }

    @Override
    public int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == value) {
                return i;
            } else if (i == count) {
                throw new IllegalArgumentException("no Such Value");
            }
        }
        return -1;
    }
}
