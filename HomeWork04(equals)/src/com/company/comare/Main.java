package com.company.comare;

public class Main {
    public static void main(String[] args) {
        AudioTrack t1 = new AudioTrack();
        AudioTrack t2 = new AudioTrack();

        int x = t1.compareTo(t2);

        boolean b = t1.equals(t2);
    }
}
