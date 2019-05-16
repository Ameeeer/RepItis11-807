package com.company.equals.comparators;

import com.company.equals.Student;

import java.util.Comparator;

public class CompareByYearBirth implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int first = o1.getYearOfBirth();
        int second = o2.getYearOfBirth();

        return first-second;
    }
}
