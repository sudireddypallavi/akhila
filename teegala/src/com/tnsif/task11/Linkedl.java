package com.tnsif.task11;
import java.util.*; 
public class Linkedl extends LinkedList  
{ 
   public static void main(String aa[]) 
   { 
     Linkedl l=new Linkedl(); 
      l.addFirst("10"); 
      l.addFirst("20"); 
      System.out.println(l); 
      l.addLast("30"); 
      l.addLast("40"); 
      System.out.println(l); 
      String ss=(String)l.getFirst(); 
      System.out.println(ss); 
      String sg=(String)l.getLast(); 
      System.out.println(sg); 
      l.removeFirst(); 
      System.out.println(l); 
      l.removeLast(); 
      System.out.println(l); 
   } 
} 

