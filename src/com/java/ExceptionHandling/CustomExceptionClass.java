package com.java;

import java.util.Scanner;

public class CustomExceptionClass {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        a = sc.nextInt();
        if (a<9){
            try{
                // throw new MyException();
                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
        System.out.println("Thankyou....");
    }
}
