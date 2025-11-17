package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {

    public static void main(String[] args) {
        Cart cart= new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99);

        System.out.println("--- Testing ADD ---");
        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.addDVD(dvd3);
        
        cart.print(); 

        System.out.println("--- Testing REMOVE (Star Wars) ---");
        cart.removeDVD(dvd2);
        
        cart.print(); 

        System.out.println("--- Testing REMOVE (Non-existent) ---");
        cart.removeDVD(dvd2); 
        
        System.out.println("--- Testing REMOVE (Empty Cart) ---");
        cart.removeDVD(dvd1);
        cart.removeDVD(dvd3);
        cart.removeDVD(dvd1); 

        cart.print();
        
        System.out.println("--- Testing ADD (Over 20 items) ---");
        for (int i = 0; i < 22; i++) {
            DigitalVideoDisc dvd = new DigitalVideoDisc("Test DVD " + (i+1), "Test", "Test", 1, 1.0);
            cart.addDVD(dvd); 
        }
        
        cart.print();
    }
}