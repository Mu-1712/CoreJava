package com.java;

import java.util.*;

public class DateClass {

    public static void main(String[] args) {



        System.out.println("The maximum value of long is :" + Long.MAX_VALUE);

        System.out.println("The value of current time in ms : " + System.currentTimeMillis());

        System.out.println("\n");



        Date d= new Date();  //gives the current date.....

        System.out.println("The current date is : " + d);

        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());



        Date d1= new Date(1621709639111l); //gives the date for the respective milliseconds which is given..

        System.out.println("The date calculated form miliseconds is : " + d1);



    }

}

