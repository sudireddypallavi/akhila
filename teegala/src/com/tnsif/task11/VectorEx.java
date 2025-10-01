package com.tnsif.task11;
import java.util.*; 
public class VectorEx 
{ 
  public static void main(String aa[]) 
  { 
   Vector l=new Vector(); 
   l.addElement("10"); 
   l.addElement("20"); 
   l.addElement("30"); 
   System.out.println(l); 
   l.removeElement("30"); 
   System.out.println(l); 
   System.out.println(l.get(0)); 
  }
}

