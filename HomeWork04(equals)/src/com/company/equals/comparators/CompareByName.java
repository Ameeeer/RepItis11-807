package com.company.equals.comparators;

import com.company.equals.Student;

import java.util.Comparator;

public class CompareByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
