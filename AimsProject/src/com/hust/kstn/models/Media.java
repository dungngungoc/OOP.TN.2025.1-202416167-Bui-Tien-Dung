package com.hust.kstn.models;

public class Media {
    private static int nbMedias = 0;
    private int id;
    private String title;
    private double cost;
    private String category;

    public Media(String title, double cost, String category) {
        this.title = title;
        this.cost = cost;
        this.category = category;
        
        nbMedias++;
        this.id = nbMedias;
    }

    @Override
    public String toString() {
        return "Media" + "[" + this.id + "]["
                + this.title + "]["
                + this.cost + "]["
                + this.category + "]";
    }
}

