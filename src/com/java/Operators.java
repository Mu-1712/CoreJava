package com.java;

import java.util.Scanner;



public class Operators {

    public static void main(String[] args) {



        //float a = 7/4.0f * 9/2.0f;

        //System.out.println(a);



        /* Encriptiong and decripting of a Char?



        char grade = 'A';

        System.out.println("Before encripting "+grade+"");

        grade = (char)(grade + 8);

        System.out.println("After encripting "+grade+"");



        System.out.println("Before decripting "+grade+"");

        grade = (char)(grade - 8);

        System.out.println("after decripting "+grade+""); */



        /* To check userdefined number is greater than fixed value?

        int num, a = 25;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your number");

        num = sc.nextInt();

        if (num > a)

            System.out.println("user entered number greater");

        else

            System.out.println("invalid"); */



       /* int v = 4, u = 2, a = 2, s = 1;

        int x = ((v*v)-(u*u))/(2*a*s);;

        System.out.println(x); */



        /* Q4 - Write the following expression in a JAVA program --- v^2-u^2/2as       */

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the values----");

        float v = sc.nextFloat();

        float u = sc.nextFloat();

        float a = sc.nextFloat();

        float s = sc.nextFloat();

        float formula = (((v*v)-(u*u))/(2*a*s));

        System.out.println(formula);



        /* Q5 - Find the value of the following expression --- int x = 7*49/7+35/7     */

        int x = 7*49/7+35/7;

        System.out.println(x);



    }

}