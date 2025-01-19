package com.java;

public class VarargsRecursion {

    //print multiplication of number using recursion?

    static void multiplication(int n){

        int i;

        for (i=1; i<=10; i++){

            System.out.format(" %d * %d = %d \n",n, i, n*i);

        }

    }

    //print a pattern using recursion?

    static void pattern01(int n){

        int i,j;

        for (i=0; i<n; i++){

            for (j=0; j<i+1; j++){

                System.out.print("*");

                System.out.print(" ");

            }

            System.out.println();

        }

    }

    static int sumRec(int n){

        // Base condition

        if (n == 1) {

            return 1;

        }

        return n + sumRec(n-1);

    }

    static int fib(int n) {

        if (n == 0 || n == 1) {

            return n - 1;

        }

        else {

            return fib(n - 1) + fib(n - 2);

        }

    }

    public static void main(String[] args) {

        // multiplication(5);

        //pattern01(4);

//        int c = sumRec(10);

//        System.out.println("sum 0f natural numbers is:" +c);

        int result = fib(7);

        System.out.println(result);

    }

}