package com.java;

class MyRunnableThread1 implements Runnable {

    @Override

    public void run() {

        int i = 0;

        while (i < 50) {

            System.out.println("he is cooking...");

            System.out.println("food was delicious...");

            i++;

        }

    }

}

class MyRunnableThread2 implements Runnable{

    @Override

    public void run() {

        int i = 0;

        while (i < 50) {

            System.out.println("he is chatting with her...");

            System.out.println("he's enjoying it...");

            i++;

        }

    }

}

public class ThreadsRunnable {

    public static void main(String[] args) {

        MyRunnableThread1 bullet1 = new MyRunnableThread1();

        Thread gun = new Thread(bullet1);

//

        //here the strat can not be executed directly, we have create a thread , then put the variable in it



        MyRunnableThread2 bullet2 = new MyRunnableThread2();

        Thread gun2 = new Thread(bullet2);



        gun.start();

        gun2.start();

    }

}

