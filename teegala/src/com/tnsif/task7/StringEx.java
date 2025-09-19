package com.tnsif.task7;
public class StringEx {
	 public static void main(String[] args) {
	        String str = new String("Hello");
	        System.out.println("---- String ----");
	        System.out.println("Original String: " + str);
	        String str2 = str.concat(" World");
	        System.out.println("After Concatenation: " + str2);
	        System.out.println("Length: " + str2.length());
	        System.out.println("Character at index 1: " + str2.charAt(1));
	        System.out.println("Substring (0,5): " + str2.substring(0, 5));
	        System.out.println("Uppercase: " + str2.toUpperCase());
	        System.out.println("Lowercase: " + str2.toLowerCase());
	        String str3 = new String("   Java   ");
	        System.out.println("Trimmed String: '" + str3.trim() + "'");
	        StringBuffer sb = new StringBuffer("Hello");
	        System.out.println("\n---- StringBuffer ----");
	        System.out.println("Original StringBuffer: " + sb);
	        sb.append(" World");
	        System.out.println("After Append: " + sb);
	        sb.insert(5, " Java");
	        System.out.println("After Insert: " + sb);
	        sb.replace(0, 5, "Hi");
	        System.out.println("After Replace: " + sb);
	        sb.delete(2, 6);
	        System.out.println("After Delete: " + sb);
	        sb.reverse();
	        System.out.println("After Reverse: " + sb);
	        System.out.println("Length: " + sb.length());
	        System.out.println("Capacity: " + sb.capacity());
	        StringBuilder sbl = new StringBuilder("Hello");
	        System.out.println("\n---- StringBuilder ----");
	        System.out.println("Original StringBuilder: " + sbl);
	        sbl.append(" World");
	        System.out.println("After Append: " + sbl);
	        sbl.insert(5, " Java");
	        System.out.println("After Insert: " + sbl);
	        sbl.replace(0, 5, "Hi");
	        System.out.println("After Replace: " + sbl);
	        sbl.delete(2, 6);
	        System.out.println("After Delete: " + sbl);
	        sbl.reverse();
	        System.out.println("After Reverse: " + sbl);
	        System.out.println("Length: " + sbl.length());
	        System.out.println("Capacity: " + sbl.capacity());
	    }
	}


	
	   

