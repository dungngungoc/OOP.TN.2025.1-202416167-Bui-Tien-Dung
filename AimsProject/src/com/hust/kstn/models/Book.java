package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private static int nbBooks = 0;
    private int id;
    private String title;
    private String category;
    private double cost;
    
    private int numOfTokens;
    private List<BookAuthor> authors = new ArrayList<>();

    public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.numOfTokens = numOfTokens;
        this.authors = authors;
        
        nbBooks++;
        this.id = nbBooks;
    }
    
    @Override
    public String toString() {
        return "Book [" + this.id + "]["
                + this.title + "] ["
                + this.cost + "]["
                + this.category + "]["
                + this.numOfTokens + "]"
                + "\nAuthors: " + this.authors;
    }
}