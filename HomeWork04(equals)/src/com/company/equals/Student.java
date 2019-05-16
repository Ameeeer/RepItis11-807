package com.company.equals;

public class Student implements Comparable<Student> {
    private String firstName;
    private String secondName;
    private int yearOfBirth;
    private int id;
    Comparable<Student> comparator;

    public Student(String firstName, String secondName, int yearOfBirth, int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.id = id;
    }

    public Student(String firstName, String secondName, int yearOfBirth, int id, Comparable<Student> comparator) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.id = id;
        this.comparator = comparator;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }
        Student st = (Student) obj;
        return this.getFirstName().toLowerCase().equals(st.getFirstName().toLowerCase()) &&
                this.getSecondName().toLowerCase().equals(st.getSecondName().toLowerCase());
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public int compareTo(Student o) {
        return id - o.getId() | yearOfBirth - o.getYearOfBirth();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", id=" + id;
    }
}
