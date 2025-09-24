package com.tnsif.task10;
class Message {
    public synchronized void printMessage(String msg){
        try {
            System.out.println(msg);
            notify();     
            wait();        
        } catch (InterruptedException e) {
        System.out.println("error");
        }
    }
}

