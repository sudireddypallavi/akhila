package com.tnsif.task8;
public class Multiplecatches {
	public static void main(String[] args) {
	    String str = "hello world";
        try {
            System.out.println("Trying to access invalid index...");
            char ch = str.charAt(20); 
            System.out.println("Character: " + ch);
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        } 
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        } 
        catch (Exception e) {
            System.out.println("Caught General Exception: " + e);
        }
        
        System.out.println("Program continues...");
    }
}





	
