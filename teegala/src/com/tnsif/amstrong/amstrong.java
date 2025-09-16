package com.tnsif.amstrong;
import java.util.Scanner;

public class amstrong {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        int original = num;
		        int sum = 0;

		        while (num > 0) {
		            int digit = num % 10;
		            sum = sum + (digit * digit * digit); // cube each digit
		            num = num / 10;
		        }

		        if (sum == original) {
		            System.out.println(original + " is an Armstrong Number.");
		        } else {
		            System.out.println(original + " is NOT an Armstrong Number.");
		        }
		    }
		}

