package com.java;

import java.time.LocalDateTime;

import java.time.LocalTime;

import java.time.format.DateTimeFormatter;

import java.util.*;

public class PractiseSet2{

    public static void main(String[] args) {



        ArrayList arr = new ArrayList();

        arr.add("Student 1");

        arr.add("Student 2");

        arr.add("Student 3");

        arr.add("Student 4");

        arr.add("Student 5");

        arr.add("Student 6");

        arr.add("Student 7");

        arr.add("Student 8");

        arr.add("Student 9");

        arr.add("Student 10");

        for (Object e: arr) {

            System.out.println(e);

        }

        System.out.println("\n");



        // Printing time using Date class in hour:Min:sec format..

        Date d = new Date();

        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

//        System.out.println("\n");



        // Printing time using Calendar class in hour:Min:sec format..

        Calendar c = Calendar.getInstance();

        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));



        // Printing time using DateTimeFormatter class in hour:Min:sec format..

        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");

        String myDate = dt.format(df);

        System.out.println(myDate);



        HashSet<Integer> s = new HashSet();

        s.add(5);

        s.add(6);

        s.add(46);

        s.add(60);

        s.add(9);

        s.add(6);

        System.out.println(s);

    }

}