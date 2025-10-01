package com.tnsif.task11;
import java.util.*; 
public class HashsetEx 
{ 
public static void main(String args[]) 
{ 
 Set l=new HashSet(); 
 l.add("10"); 
 l.add("20"); 
 l.add("30"); 
 l.add("30"); 
 System.out.println(l); 
 l.remove("30"); 
 System.out.println(l); 
}
}