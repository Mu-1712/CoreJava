package com.java.MultiThreading;

class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
            System.out.println("Demon Slayer :" + this.getName());
        }
    }

 class PriorityThread2 extends Thread {
        public PriorityThread2(String name) {
            super(name);
        }

        @Override
        public void start() {
                System.out.println("Onepiece :" + this.getName());
            }
        }
    public class ThreadsPriorities {
        public static void main(String[] args) {

            //DemonSlayer Threads
            PriorityThread t1 = new PriorityThread("Muzan (most important)");
            PriorityThread t2 = new PriorityThread("Tanjiro");
            PriorityThread t3 = new PriorityThread("Ubhuyashki");

            System.out.println("Defalut Priorities of Thread's t1, t2, t3 is : " +Thread.currentThread().getPriority());

            //After Assigning Constants defined in Thread class:
            t1.setPriority(Thread.MAX_PRIORITY);
            t2.setPriority(Thread.MIN_PRIORITY);
            t3.setPriority(Thread.NORM_PRIORITY);

            t1.start();
            t2.start();
            t3.start();

            //Onepiece Threads
            PriorityThread2 t4 = new PriorityThread2("Luffy (most important)");
            PriorityThread2 t5 = new PriorityThread2("Zoro");
            PriorityThread2 t6 = new PriorityThread2("Sanji");

            //After Assigning Preiority numbers to Thread class:
            t4.setPriority(9);
            t5.setPriority(6);
            t6.setPriority(2);

            t4.start();
            t5.start();
            t6.start();
        }
    }