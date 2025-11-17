package com.hust.kstn.test;

import com.hust.kstn.models.Store;
import com.hust.kstn.models.DigitalVideoDisc;

public class StoreTest {

    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        
        System.out.println("--- Testing ADD to Store ---");
        store.addDVD(dvd1);
        store.addDVD(dvd2);

        System.out.println("--- Testing REMOVE from Store (Star Wars) ---");
        store.removeDVD(dvd2);

        System.out.println("--- Testing REMOVE (Non-existent) ---");
        store.removeDVD(dvd2);
        
        System.out.println("--- Testing REMOVE (Empty Store) ---");
        store.removeDVD(dvd1);
        store.removeDVD(dvd1);
    }
}