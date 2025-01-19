package com.java.MultiThreading;


class MyNewThread extends Thread {

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
//            System.out.println(i);
            i++;
        }
    }
}

public class Thread_Run {
        public static void main(String[] args) {

            MyNewThread  t1 = new MyNewThread ();
            MyNewThread  t2 = new MyNewThread ();
            t1.run();
            t2.run();
        }
    }
