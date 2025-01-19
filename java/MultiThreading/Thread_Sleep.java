package com.java;

class MyNewThr extends Thread {

    @Override

    public void run() {

        int i = 0;
        while (i <5) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000); // Sleep the thread for 1000 milliseconds
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}

public class Thread_Sleep {
    public static void main(String[] args) {

        MyNewThr t1 = new MyNewThr();
        MyNewThr t2 = new MyNewThr();

        t1.setName("Main Thread t1");
        t2.setName("Thread t2");

        t1.start();
        //we cant call same thread twice, cuz After starting a thread,
        // it can never be started again, if called it will throw
        //IllegalThreadStateException
        //t1.start();
        t2.start();

        //Example of the sleep() Method in Java : on the main thread
        // The main thread sleeps for the 1500 milliseconds, which is 1.5 sec
        // whenever the loop runs
//        try{
//            for(int j=0; j<=5; j++){
//                Thread.sleep(1500);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}