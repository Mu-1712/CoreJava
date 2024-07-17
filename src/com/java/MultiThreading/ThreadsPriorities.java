package com.java;

class MyThr1 extends Thread {

    public MyThr1(String name){

        super(name);

    }

    @Override

    public void run() {

        int i = 0;

        while (i < 3) {

            System.out.println("Thank you :" + this.getName());

            i++;

        }

    }

}

public class ThreadsPriorities {

    public static void main(String[] args) {



        MyThr1 t1 = new MyThr1("Mujahid (most important)");

        MyThr1 t2 = new MyThr1("Musharaf");

        MyThr1 t3 = new MyThr1("Mujammil");

        MyThr1 t4 = new MyThr1("Mujaffar");

        MyThr1 t5 = new MyThr1("family");



        t1.setPriority(Thread.MAX_PRIORITY);

        t2.setPriority(Thread.MIN_PRIORITY);

        t3.setPriority(Thread.MIN_PRIORITY);

        t4.setPriority(Thread.MIN_PRIORITY);

        t5.setPriority(Thread.MIN_PRIORITY);



        t1.start();

        t2.start();

        t3.start();

        t4.start();

        t5.start();

    }

}

