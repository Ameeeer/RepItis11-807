package com.company;

import com.company.tracks.AudioTrack;
import com.company.tracks.PlayList;

public class Main {

    public static void main(String[] args) {
        AudioTrack track1 = new AudioTrack(120,"keke");
        AudioTrack track2 = new AudioTrack(1123,"ppp");
        AudioTrack track3 = new AudioTrack(12033,"kkk");
        Queue<AudioTrack> playlist = new Queue<>();
        playlist.enqueue(track1);
        playlist.enqueue(track2);
        playlist.enqueue(track3);
        System.out.println(playlist.dequeue().getDuration());
        System.out.println(playlist.dequeue().getDuration());
    }
}
