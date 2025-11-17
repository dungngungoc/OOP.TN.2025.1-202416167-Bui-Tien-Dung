package com.hust.kstn.models;

public class Store {
    public static final int MAX_ITEMS_IN_STORE = 100;
    
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    
    private int qtyItems = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyItems >= MAX_ITEMS_IN_STORE) {
            System.out.println("The store is full.");
        } else {
            itemsInStore[qtyItems] = disc;
            qtyItems++;
            System.out.println("The disc has been added to the store.");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyItems == 0) {
            System.out.println("The store is empty.");
            return;
        }

        int indexToRemove = -1;
        for (int i = 0; i < qtyItems; i++) {
            if (itemsInStore[i] == disc) { 
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove == -1) {
            System.out.println("The disc does not exist in the store.");
        } else {
            for (int i = indexToRemove; i < qtyItems - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            
            itemsInStore[qtyItems - 1] = null;
            qtyItems--;
            System.out.println("The disc has been removed from the store.");
        }
    }
}