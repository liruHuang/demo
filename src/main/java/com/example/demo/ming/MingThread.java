package com.example.demo.ming;

public class MingThread extends Thread {

    @Override
    public void run() {
        System.out.println("Ming go buy soy source!");
        try {
            sleep(7000);
            System.out.println("Ming go home with soy source");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
