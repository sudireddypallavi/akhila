package com.tnsif.task10;
public class WaitNotifySimple {
    public static void main(String[] args) {
        Message message = new Message();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                message.printMessage("Hello from Thread 1");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                message.printMessage("Hi from Thread 2");
            }
        });

        t1.start();
        t2.start();
    }
}

