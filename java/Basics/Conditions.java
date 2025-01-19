package com.java;

import java.util.Scanner;



public class Conditions {

    public static void main(String[] args) {



      /*  int a = 10;

        if(a=11)

            System.out.println("i am 11");

        else

            System.out.println(" i am not 11"); */



      /*Program to find Pass or fail of a student?



        int s1, s2, s3;

        float avg;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter s1 marks;");

        s1 = sc.nextInt();

        System.out.println("Enter s2 marks;");

        s2 = sc.nextInt();

        System.out.println("Enter s3 marks;");

        s3 = sc.nextInt();

        avg = (s1 + s2 + s3)/3.0f;

        if( avg>=40 && s1>=33 && s2>=33 && s3>=33 )

            System.out.println("Pass");

        else

            System.out.println("Fail"); */





        /* Program to find tx payable by an employee?



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your income in Lakhs per annum");

        float tax = 0;

       float income = sc.nextFloat();

        if(income<=2.5){

            tax = tax + 0;

        }

        else if(income>2.5f && income <= 5f){

            tax = tax + 0.05f * (income - 2.5f);

        }

        else if(income>5f && income <= 10.0f){

            tax = tax + 0.05f * (5.0f - 2.5f);

            tax = tax + 0.2f * (income - 5f);

        }

        else if(income>10.0f){

            tax = tax + 0.05f * (5.0f - 2.5f);

            tax = tax + 0.2f * (10.0f - 5f);

            tax = tax + 0.3f * (income - 10.0f);

        }



        System.out.println("The total tax paid by the employee is: " + tax); */





        /*Program to print days based on their number?



        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter your number");

        int day = sc.nextInt();

        switch(day){

            case 1 -> System.out.println("Monday");

            case 2 -> System.out.println("Tuesday");

            case 3 -> System.out.println("Wednesday");

            case 4 -> System.out.println("Thursday");

            case 5 -> System.out.println("Friday");

            case 6 -> System.out.println("Saturday");

            case 7 -> System.out.println("Sunday");

        }*/



        //Program to find type of website from a url?



        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter Website:");

        String website = sc.next();

        if (website.endsWith(".com"))



            System.out.println("Commercial Website.");



        else if (website.endsWith(".org"))



            System.out.println("Organisation Website.");



        else if(website.endsWith(".in"))

            System.out.println("Indian website");

        else

            System.out.println("enter valid website");

    }



}