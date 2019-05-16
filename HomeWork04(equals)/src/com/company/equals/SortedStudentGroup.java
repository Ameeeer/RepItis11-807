package com.company.equals;

import java.util.Arrays;
import java.util.Comparator;

public class SortedStudentGroup {
    Student[] listStudens;
    Comparator<Student> comparator;
    int n = 0;

    public SortedStudentGroup(int size) {
        this.listStudens = new Student[size];
    }

    public SortedStudentGroup(int size, Comparator<Student> comparator) {
        this(size);
        this.comparator = comparator;
    }

    public void add(Student student) {
        int count = 0;
        if (comparator == null) {
            while (count < n && listStudens[count].compareTo(student) < 0) {
                count++;
            }
        } else {
            while (count < n && comparator.compare(listStudens[count], student) < 0) {
                count++;
            }

        }
        //сдвиг
        for (int i = n - 1; i >= count; i--) {
            listStudens[i+1] = listStudens[i];
        }
        listStudens[count] = student;
        n++;
    }
    public void show (){
        for (int i = 0; i < n; i++) {
            System.out.println(listStudens[i].toString());
        }
    }

}
