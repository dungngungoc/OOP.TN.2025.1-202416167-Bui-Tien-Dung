package com.hust.kstn.models;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc(String title, double cost, String category, int length, String director) {
        super(title, cost, category);
        this.length = length;
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}