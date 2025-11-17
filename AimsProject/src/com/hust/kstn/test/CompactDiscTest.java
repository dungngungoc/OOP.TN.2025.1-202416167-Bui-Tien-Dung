package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;
import java.util.ArrayList;
import java.util.List;

public class CompactDiscTest {

    public static void main(String[] args) {
        Track track1 = new Track("Track A - Intro", 4);
        Track track2 = new Track("Track B - Main Song", 5);
        Track track3 = new Track("Track C - Zero Length", 0);

        List<Track> tracks = new ArrayList<>();
        tracks.add(track1);
        tracks.add(track2);
        
        CompactDisc cd1 = new CompactDisc("Best of 2000s", "Pop", 19.99, "Various Artists", "John Smith", tracks);
        
        System.out.println("--- TESTING CD ---");
        System.out.println("Total Length: " + cd1.totalLength() + " mins");
        
        System.out.println("\n--- TESTING ADD/REMOVE ---");
        cd1.addTrack(track1);
        cd1.addTrack(track3);
        cd1.removeTrack(track2);
        
        System.out.println("\n--- TESTING PLAY ---");
        cd1.play();
    }
}