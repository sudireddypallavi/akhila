package com.tnsif.task7;

public class AutoUnboxingEx1 {
    public static void main(String[] args) {
             Integer obj = 100;   
        int num = obj;       
        System.out.println("Wrapper Integer: " + obj);
        System.out.println("Primitive int after unboxing: " + num);
    }
}