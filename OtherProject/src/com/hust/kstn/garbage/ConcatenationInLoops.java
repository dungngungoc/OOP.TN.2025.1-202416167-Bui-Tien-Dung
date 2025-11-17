package com.hust.kstn.garbage;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        
        Random r1 = new Random(123);
        long start1 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 65536; i++) {
            s += r1.nextInt(2); 
        }
        System.out.println("Time taken with String +: " + (System.currentTimeMillis() - start1) + " ms"); 

     
        Random r2 = new Random(123);
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append(r2.nextInt(2));
        }
        s = sb.toString();
        System.out.println("Time taken with StringBuilder: " + (System.currentTimeMillis() - start2) + " ms"); 
    }
}