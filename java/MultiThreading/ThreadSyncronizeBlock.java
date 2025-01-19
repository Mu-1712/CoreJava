package com.java.MultiThreading;

class Table2 {
    void printTable(int n) {
        synchronized (this) { // synchronized Block
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class SynThread extends Thread {
    Table2 t;
    SynThread(Table2 t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}

class SynThread2 extends Thread {
    Table2 t;
    SynThread2(Table2 t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}

 class ThreadSynchronizeBlock {
    public static void main(String args[]) {
        Table2 obj = new Table2(); // only one object
        SynThread t1 = new SynThread(obj);
        SynThread2 t2 = new SynThread2(obj);
        t1.start();
        t2.start();
    }
}
