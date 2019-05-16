package com.company.equals.comparators;

public class DashLettersTest {
    public static void main(String[] args) {
        DashLetters dashLetters = new DashLetters() {
            @Override
            public String dash(String s) {
                String k = s.replace((char) ('A'),'-');
                return k;
            }
        };
        System.out.println(dashLetters.dash("aA"));
    }
}
