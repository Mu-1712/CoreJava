package com.java;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        //Program to find sum of n even numbers?

        /*int i=0, sum=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number;");

        int n = sc.nextInt();

        while (i<=n){

            sum = sum + i;

            i++;

        }

        System.out.println(sum); */



        //Program to print multi[plication of a goven number?

        int i;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number;");

        int n = sc.nextInt();

        System.out.println("the multiplication of "+n+" is");

        for(i=1;i<=n;i++){

            System.out.printf("%d * %d = %d\n", n, i, n*i);

        }





        //Program to print multi[plication of a given number in reverse order?

//        int i;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter a number;");
//
//        int n = sc.nextInt();
//
//        System.out.println("the multiplication of "+n+" is");
//
//        for(i=10;i>=1;i--){
//
//            System.out.printf("%d * %d=%d\n", n, i, n*i);
//
//        }



        /*Program to print factorial of a given number?

        int i=1,fact=1;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number;");

        int n = sc.nextInt();

        System.out.println("the factorial of "+n+" is");

        while (i<=n){

            fact = fact * i;

            i++;

        }

        System.out.println(fact); */



        /*Repeat a number ?

        int a = 5;

            while(true){

                System.out.println(a);

            } */



        /*Write a program to calculate the sum of the numbers

           occurring in the multiplication table of 8.



        int n = 8;

        int sum = 0;

       for(int i=1;i<=10;i++){

            sum += n*i;

        }

        System.out.println(sum); */









    }

}