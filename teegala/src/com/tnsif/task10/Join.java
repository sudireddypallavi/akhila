package com.tnsif.task10;
class Join
{
 public static void main (String[] args) {
     Joining t1 = new Joining();
     Joining t2 = new Joining();
     Joining t3 = new Joining();
     t1.start();
     try
     {
         System.out.println("Current Thread: "+ Thread.currentThread().getName());
         t1.join();
     }

     catch(Exception ex)
     {
         System.out.println("Exception has " +"been caught" + ex);
     }
     t2.start();
     try
     {
         System.out.println("Current Thread: " + Thread.currentThread().getName());
         t2.join();
     }

     catch(Exception ex)
     {
         System.out.println("Exception has been" + " caught" + ex);
     }
     t3.start();
     try
     {
         System.out.println("Current Thread: " + Thread.currentThread().getName());
         t3.join();
     }

     catch(Exception ex)
     {
         System.out.println("Exception has been" +" caught" + ex);
     }
 }
 }


