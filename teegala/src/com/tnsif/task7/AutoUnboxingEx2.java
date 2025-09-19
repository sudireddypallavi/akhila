package com.tnsif.task7;
import java.util.ArrayList;  
public class AutoUnboxingEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(10));
        list.add(Integer.valueOf(20));
        list.add(Integer.valueOf(30));
        int sum = 0;
        for (Integer val : list) {
            sum += val; 
        }
        System.out.println("ArrayList values: " + list);
        System.out.println("Sum using unboxed values: " + sum);
    }
}
