package com.example.demo.ming;

public class Mama {
    public Mama() {
        System.out.println(Thread.currentThread().getName());
        try {
            System.out.println("cooking dish #1");
            Thread.sleep(5000);
            System.out.println("finished #1");
            System.out.println("cooking dish #2");

            new MingThread() {
                @Override
                public void run() {
                    System.out.println("Ming go buy soy source");
                    try {
                        sleep(7000);
                        System.out.println("Ming go home with soy source");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }.start();

            /*System.out.println(Thread.currentThread().getName());
            MingThread ming = new MingThread();
            ming.start();*/

        //    ming.join();
            Thread.sleep(5000);
            System.out.println("finished #2");

            /*Thread thread = new Thread();
            System.out.println(thread.getName());
            thread.start();
            thread.run() ;  */

            System.out.println("cooking dish #3");
            Thread.sleep(5000);
            System.out.println("finished #3");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        new Mama();
    }

}
