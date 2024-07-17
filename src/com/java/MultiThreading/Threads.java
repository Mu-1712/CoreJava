package com.java;

class MyThread extends Thread {

    @Override

    public void run() {

        int i = 0;

        while (i < 5) {

            System.out.println("he is cooking...");

            System.out.println("food was delicious...");

            i++;

        }

    }

}

class MyThread2 extends Thread {

    @Override

    public void run() {

        int i = 0;

        while (i < 5) {

            System.out.println("he is chatting with her...");

            System.out.println("he's enjoying it...");

            i++;

        }

    }

}

public class Threads {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        MyThread2 t2 = new MyThread2();

        t1.start();

        t2.run();

    }

}