package com.tnsif.prime;
import java.util.Scanner;

public class prime {
     public static void main(String[] args) {
    	
	        System.out.print("Enter a number: ");
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();

	        boolean isPrime = true;

	        if (num <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break; 
	                }
	            }
	        }
	        if (isPrime) {
	            System.out.println(num + " is a Prime Number.");
	        } else {
	            System.out.println(num + " is NOT a Prime Number.");
	        }
	    }
}



		        