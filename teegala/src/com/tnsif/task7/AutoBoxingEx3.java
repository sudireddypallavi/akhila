package com.tnsif.task7;

public class AutoBoxingEx3 {

   
    static void displayInteger(Integer num) {
        System.out.println("Received Integer object: " + num);
    }

    public static void main(String[] args) {
        int x = 50;

        
        displayInteger(x);
    }
}
