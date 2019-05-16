package com.company.tracks;

public class AudioTrack implements Comparable<AudioTrack> {
    int duration;
    String title;
    String author;

    public int getDuration() {
        return this.duration;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public AudioTrack(int duration, String title, String author) {
        this.duration = duration;
        this.title = title;
        this.author = author;
    }

    public AudioTrack(int duration, String title) {
        this.duration = duration;
        this.title = title;
    }

    @Override
    public int compareTo(AudioTrack o) {
        return duration - o.duration;//сравнение по продолжительности

        //сравнение сначала по продолжительности, а если совпадает, то по имени
//        int d = duration - o.duration;
//        if (d != 0) {
//            return d;
//        } else {
//            return title.compareTo(o.title);
//        }

//        if (duration > o.duration) {
//            return 1;
//        }
//        if (duration < o.duration) {
//            return -1;
//        }
//        if (duration == o.duration) {
//            return 0;
//        }
    }
}
