package com.java;

class thr extends Thread{

    public void run(){

        // while (true) {

        System.out.println("Good Morning");

        // }

    }

}

class thr1 extends Thread{

    public void run(){

        // while (true) {

        System.out.println("Welcome");

        try {

            Thread.sleep(200);

        }

        catch (InterruptedException e){

            e.printStackTrace();

        }

        // }

    }

}

public class ThreadsPractise


{

    public static void main(String[] args) {

        thr t = new thr();

        thr1 t1 = new thr1();

        t.start();

        t1.start();



        // sets the thread priority.

        t.setPriority(10);

        t1.setPriority(1);



        // returns the thread priority.

        System.out.println(t.getPriority());

        System.out.println(t1.getPriority());



        // gives state of thread

        System.out.println(t.getState());

        System.out.println(t1.getState());



        // gives reference of thread

        System.out.println(Thread.currentThread().getState());

    }

}