package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {	
    
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, double cost, String artist, String director, List<Track> tracks) {
        super(title, cost, category, 0, director);
        this.artist = artist;
        this.tracks = tracks;
    }
    
    public int totalLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }

    // Giữ lại addTrack()
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        } else {
            System.out.println("Track already exists.");
        }
    }
    
    // Giữ lại removeTrack()
    public void removeTrack(Track track) {
        if (tracks.remove(track)) {
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track does not exist in the list.");
        }
    }

    // Giữ lại play()
    public void play() {
        if (totalLength() > 0) {
            System.out.println("Playing CD: " + this.getTitle() + ". Total duration: " + totalLength() + " minutes.");
            for (Track track : tracks) {
                // Giả định getTitle() được kế thừa từ Media
                track.play();
            }
        } else {
            System.out.println("Cannot play CD '" + this.getTitle() + "' because total duration is <= 0.");
        }
    }

    @Override
    public String toString() {
        return "CompactDisc " + super.toString() 
                + "\nArtist: " + this.artist 
                + ". Total Tracks: " + this.tracks.size() 
                + ". Length: " + totalLength() + " mins.";
    }

    private String getTitle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}