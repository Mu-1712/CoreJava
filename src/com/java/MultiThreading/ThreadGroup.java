package com.java.MultiThreading;

class myThreadGroup extends Thread{
    public  myThreadGroup (ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        int i = 0;
        for (i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished executing.");
    }

    public static void main(String[] args) {

        // Create a thread group
        ThreadGroup group = new ThreadGroup("My ThreadGroup");

        // Create and start threads in the group
        myThreadGroup t1 = new myThreadGroup(group, "Thread 1");
        myThreadGroup t2 = new myThreadGroup(group, "Thread 2");
        myThreadGroup t3 = new myThreadGroup(group, "Thread 3");

        t1.start();
        t2.start();
        t3.start();

// checking the number of active thread by invoking the activeGroupCount() method
        System.out.println("The total number of active thread groups are: " + group.activeGroupCount());
    }
}