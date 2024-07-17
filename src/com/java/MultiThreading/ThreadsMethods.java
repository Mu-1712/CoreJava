package com.java;

class MyNewThr extends Thread {

    @Override

    public void run() {

        int i = 0;

        while (i <50) {

            System.out.println("Tanjiroooo...");

            try {

                Thread.sleep(556); // Sleep the thread for 556 milliseconds

            }

            catch (InterruptedException e){

                e.printStackTrace();

            }

            i++;

        }

    }

}

class MyNewThr2 extends Thread {

    @Override

    public void run() {

        //int i = 0;

        while (true) {

            System.out.println("Astaaaa...");

            // i++;

        }

    }

}

public class ThreadsMethods {

    public static void main(String[] args) {

        MyNewThr t1 = new MyNewThr();

        MyNewThr2 t2 = new MyNewThr2();

        t1.start();

//        try {

//            t1.join(); //to use join method  try-catch os must....

//        }

//        catch (Exception e){

//            System.out.println(e);

//        }



        t2.start();

    }

}