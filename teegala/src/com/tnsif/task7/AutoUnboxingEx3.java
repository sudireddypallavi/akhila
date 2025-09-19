package com.tnsif.task7;
public class AutoUnboxingEx3 {
    static void printNumber(int num) {
        System.out.println("Received primitive int: " + num);
    }

    public static void main(String[] args) {
        Integer obj = 500;  
        printNumber(obj);
    }
}