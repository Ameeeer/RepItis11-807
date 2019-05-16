package com.company.equals;

import com.company.equals.comparators.CompareByID;
import com.company.equals.comparators.CompareByName;
import com.company.equals.comparators.CompareByYearBirth;

import java.util.Comparator;
import java.util.Scanner;

public class MainStudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Андрей", "Popov", 1999, 1);
        Student st2 = new Student("Володя", "Shmelev", 2000, 2);
        Student st3 = new Student("Петя", "Guskov", 1987, 3);
        Student st4 = new Student("Игорь", "Ove4nokov", 1998, 4);
        System.out.println("Введите число от 1 до 4 " +"\n" +
        "1 - сортировка по имени " + "\n" +
        "2 - сортировка по дате рождения " +"\n" +
        "3 - сортировка по id " + "\n" +
        "4 - сортировка по Фамилии "

        );
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        switch (value) {
            case 1: {
                Comparator<Student> studentComparator = new CompareByName();
                SortedStudentGroup sortedStudentGroup = new SortedStudentGroup(10,studentComparator);
                sortedStudentGroup.add(st1);
                sortedStudentGroup.add(st2);
                sortedStudentGroup.add(st3);
                sortedStudentGroup.add(st4);
                sortedStudentGroup.show();
                break;
            }
            case 2: {
                Comparator<Student> studentComparator = new CompareByYearBirth();
                SortedStudentGroup sortedStudentGroup = new SortedStudentGroup(10,studentComparator);
                sortedStudentGroup.add(st1);
                sortedStudentGroup.add(st2);
                sortedStudentGroup.add(st3);
                sortedStudentGroup.add(st4);
                sortedStudentGroup.show();
                break;
            }
            case 3: {
                Comparator<Student> studentComparator  = (o1,o2) -> o2.getId() - o1.getId();
                SortedStudentGroup sortedStudentGroup = new SortedStudentGroup(10,studentComparator);
                sortedStudentGroup.add(st1);
                sortedStudentGroup.add(st2);
                sortedStudentGroup.add(st3);
                sortedStudentGroup.add(st4);
                sortedStudentGroup.show();
                break;
            }case 4: {
                Comparator<Student> studentComparator  = (o1,o2) -> o2.getSecondName().compareTo(o2.getSecondName());
                SortedStudentGroup sortedStudentGroup = new SortedStudentGroup(10,studentComparator);
                sortedStudentGroup.add(st1);
                sortedStudentGroup.add(st2);
                sortedStudentGroup.add(st3);
                sortedStudentGroup.add(st4);
                sortedStudentGroup.show();
                break;
            }
        }
    }
}
