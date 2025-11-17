package com.hust.kstn.garbage;

public class NoGarbage {
    public static void main(String[] args) {
        
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 100000; i++) {
            sb.append("a"); 
        }
        String outputString = sb.toString();
        long endTime = System.currentTimeMillis();
        
        System.out.println("Time taken by NoGarbage: " + (endTime - startTime) + " ms");
    }
}