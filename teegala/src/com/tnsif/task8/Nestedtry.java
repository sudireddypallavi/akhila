package com.tnsif.task8;

public class Nestedtry {

	public static void main(String[] args) {
		String str="hello world";
		try {
			System.out.println("this is outer try");
		try {
			char ch=str.charAt(20);
		}catch(Exception e){
			System.out.println("String out of bound exception");
		}
		String st=null;
		System.out.println(st.length());
		}
		catch(NullPointerException e){
			System.out.println("Outer catch:" +e);
		}
	}
}

	
