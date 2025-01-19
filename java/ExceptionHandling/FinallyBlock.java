package com.java;

public class FinallyBlock {
    public static void main(String[] args) {

        // 1) program does not throw any exception, & the finally block is executed after the try block.
        try {
            int a = 50;
            int b = 5;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) { //catch wont be excuted bcuz ther is no exception
            System.out.println(e);
        } finally {
            System.out.println("Finally block when no Exception thrown");
        }

        // 2) program throws exception,exception is  handled, and finally block is also executed after the try block.
        try {
            int a = 50;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch(ArithmeticException e){
            System.out.println("Exception Handled " + e);
        }
        finally {
            System.out.println("Finally block when Exception thrown and it is handled");
        }

        // 3) program throws exception, but not handles,eventhough the finally block is executed after the try block.
        try {
            int a = 50;
            int b = 0;
            int c = a / b; // This line throws ArithmeticException
            System.out.println(c);
        } catch(NullPointerException e){  // This catch block doesn't handle ArithmeticException
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block when Exception thrown but not handled");
        }
    }
}
