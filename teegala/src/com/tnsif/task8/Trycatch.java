package com.tnsif.task8;

public class Trycatch {

	public static void main(String[] args) {
		String str="hello world";
		try {
			char ch=str.charAt(20);
		}catch(Exception e){
			System.out.println("String out of bound exception");
		}
		

	}
}
