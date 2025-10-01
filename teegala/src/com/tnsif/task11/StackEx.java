package com.tnsif.task11;
import java.util.*; 
public class StackEx
{ 
   public static void main(String args[]) 
   { 
     Stack s=new Stack(); 
     s.push("10"); 
     s.push(20); 
     s.push(30); 
     s.push("40"); 
     s.push(null); 
     System.out.println(s); 
     s.pop(); 
     System.out.println(s); 
     System.out.println(s.peek()); 
     System.out.println(s); 
     } 
} 

