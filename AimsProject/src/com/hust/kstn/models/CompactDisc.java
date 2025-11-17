package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
    private static int nbCompactDiscs = 0;
    private int id;
    private String title;
    private String category;
    private double cost;
    
    private String artist;
    private String director;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, double cost, String artist, String director, List<Track> tracks) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.artist = artist;
        this.director = director;
        this.tracks = tracks;
        
        nbCompactDiscs++;
        this.id = nbCompactDiscs;
    }

    public int totalLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }
    
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        } else {
            System.out.println("Track already exists.");
        }
    }
    
    public void removeTrack(Track track) {
        if (tracks.remove(track)) {
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track does not exist in the list.");
        }
    }
    
    public void play() {
        if (totalLength() > 0) {
            System.out.println("Playing CD: " + this.title + ". Total duration: " + totalLength() + " minutes.");
            for (Track track : tracks) {
                track.play();
            }
        } else {
            System.out.println("Cannot play CD '" + this.title + "' because total duration is <= 0.");
        }
    }
    
    @Override
    public String toString() {
        return "CompactDisc [" + this.id + "][" + this.title + "] [" + this.cost + "] [" + this.category + "]"
                + "\nArtist: " + this.artist + ". Total Tracks: " + this.tracks.size() + ". Length: " + totalLength() + " mins.";
    }
}