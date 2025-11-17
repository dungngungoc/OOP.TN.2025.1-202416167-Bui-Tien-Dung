package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
    
    public DigitalVideoDisc(String title) {
        super(title, 0.0, "", 0, "");
    }

    public DigitalVideoDisc(String category, String title, double cost) {
        super(title, cost, category, 0, "");
    }

    public DigitalVideoDisc(String director, String category, String title, double cost) {
        super(title, cost, category, 0, director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(title, cost, category, length, director);
    }
    
    @Override
    public String toString() {
        return "DigitalVideoDisc " + super.toString() 
                + "[" + this.getLength() + "][" + this.getDirector() + "]";
    }

    String getTitle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getCost() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
}