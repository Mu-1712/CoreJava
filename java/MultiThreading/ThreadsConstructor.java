package com.java;

class MyThr extends Thread {

    public MyThr(String name){

        super(name);

    }

    @Override

    public void run() {

        int i = 0;

        while (i < 3) {

            System.out.println("he is cooking...");

            System.out.println("food was delicious...");

            i++;

        }

    }

}

class MyThr2 extends Thread {

    public MyThr2(String name){

        super(name);

    }

    @Override

    public void run() {

        int i = 0;

        while (i < 3) {

            System.out.println("he is chatting...");

            System.out.println("having fun...");

            i++;

        }

    }

}



public class ThreadsConstructor {

    public static void main(String[] args) {

        MyThr t = new MyThr("Musharaf");

        MyThr2 t2 = new MyThr2("Devil");

        t.start();

        t2.start();

        System.out.println("Thread id of MyThr is" + t.getId());

        System.out.println("Thread id of MyThr is" + t.getName());

        System.out.println("Thread id of MyThr is" + t2.getId());

        System.out.println("Thread id of MyThr is" + t2.getName());

    }

}