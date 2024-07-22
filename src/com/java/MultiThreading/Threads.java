package com.java.MultiThreading;

// Extending Thread class
class MyExtendThread extends Thread {
    public void run() {
        System.out.println("Extending Thread class");
        System.out.println("Thread is Running, extended by Thread....");
    }
}

// Implementing Runnable interface
class MyRunnableThread implements Runnable {
    public void run() {
        System.out.println("Implementing Runnable interface");
        System.out.println("Thread is Running, implemented from Runnable....");
    }
}

class DaemonThread extends Thread {
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println(Thread.currentThread() + " is Daemon Thread");
        } else {
            System.out.println("User Thread");
        }
    }
}
public class Threads {
    public static void main(String[] args) {

        // 1) Java Thread Example by extending Thread class
        MyExtendThread t1 = new MyExtendThread();
        t1.start();

        // 2) Thread Example by implementing Runnable interface
        MyRunnableThread mrt = new MyRunnableThread();
        Thread t2 = new Thread(mrt);  // Using the constructor Thread(Runnable r)
        t2.start();

        // 3) Using the Thread Class: Thread(String name)
        Thread t3 = new Thread("My String Thread");
        String str = t3.getName();
        System.out.println("Thread class using the constructor Thread(String name): " + str);

        // 4) Using the Thread Class: Thread(Runnable r, String name)
        Runnable mrt2 = new MyRunnableThread();
        Thread t4 = new Thread(mrt2, "My Runnable String Thread");
        t4.start();
        String str2 = t4.getName();
        System.out.println("Thread Class: Thread(Runnable r, String name): " + str2);

        // Daemon Thread
        DaemonThread dt = new DaemonThread();
        dt.setDaemon(true);
        dt.setName("Daemon Thread");
        dt.start();

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
