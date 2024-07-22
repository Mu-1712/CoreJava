package com.java.MultiThreading;

class myThread extends Thread {
    public myThread(ThreadGroup group, String name) {
        super(group, name);
        start();
    }

        @Override
        public void run() {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Exception Handled" +e);
                }
            }
        }
        public class ThreadGroup_Methods {
        public static void main(String[] args) {

            // Create a thread group
            ThreadGroup group = new ThreadGroup("My ThreadGroup");
            ThreadGroup group2 = new ThreadGroup("My ThreadGroup 2");

            // Create and start threads in the group
         myThread t1 = new myThread(group, "Thread 1");
         System.out.println("Starting the Thread 1");

         myThread t2 = new myThread(group, "Thread 2");
         System.out.println("Starting the Thread 2");

            // Create and start threads in the group 2
         myThread t3 = new myThread(group2, "Thread 3");
         System.out.println("Starting the Thread 3");

         myThread t4 = new myThread(group2, "Thread 4");
         System.out.println("Starting the Thread 4");

            // checking the number of active thread by invoking the activeCount() method
            System.out.println("The total number of active threads are: " + group.activeCount());

            //Max priority in ThreadGroup
            int priority = group.getMaxPriority();
            System.out.println("The maximum priority of the Group: " + priority);
            
            //Get parentThreadGroup
            System.out.println("The ParentThreadGroup for " + group.getName() + " is " + group.getParent().getName());
            System.out.println("The ParentThreadGroup for " + group2.getName() + " is " + group2.getParent().getName());

        }
        }