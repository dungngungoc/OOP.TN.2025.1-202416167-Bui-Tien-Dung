package com.hust.kstn.models;

public class Track {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    
    public void play() {
        if (this.length > 0) {
            System.out.println("Playing track: " + this.title + ". Duration: " + this.length);
        } else {
            System.out.println("Cannot play track '" + this.title + "' because length is <= 0.");
        }
    }
}