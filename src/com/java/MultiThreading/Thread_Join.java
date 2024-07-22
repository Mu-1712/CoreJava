package com.java.MultiThreading;

class MyJoinThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Sleep the thread for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

public class Thread_Join {
    public static void main(String[] args) {
        MyJoinThread t1 = new MyJoinThread();
        MyJoinThread t2 = new MyJoinThread();
        MyJoinThread t3 = new MyJoinThread();

        t1.setName("Main Thread t1");
        t2.setName("Thread t2");
        t3.setName("Thread t3");

        t1.start();

        try {
            System.out.println("Waiting for " + t1.getName() + " to complete...");
            t1.join(1000); // Wait for t1 to complete
            //t1.join(); // Wait for t1 to complete
            System.out.println(t1.getName() + " has completed.");
        } catch (InterruptedException e) {
            System.out.println("Exception Handled: " + e);
        }

        // Here, the threads t2 and t3 start after thread t1 is finished
        t2.start();
        t3.start();
    }
}