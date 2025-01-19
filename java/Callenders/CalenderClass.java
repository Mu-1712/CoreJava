package com.java;

import java.util.*;

public class CalenderClass {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        System.out.println(c.getCalendarType());  //getCalendarType() returns the type of the calendar

        System.out.println(c.getTimeZone());     //getTimezone() returns the time zone

        System.out.println("Current year is :"+ c.get(Calendar.YEAR));   //returns current year

        System.out.println("Current month is :"+ c.get(Calendar.MONTH)); //The indexing for month field ranges from [0,11]

        System.out.println("Current day is :"+ c.get(Calendar.DAY_OF_WEEK));   //returns current week

        System.out.println("Current time is :"+ c.get(Calendar.HOUR_OF_DAY) +":"+ c.get(Calendar.MINUTE) + ":"+ c.get(Calendar.SECOND));  //returns time in 24hrs format

        System.out.println("Current date is : " + c.getTime());

        c.add(Calendar.YEAR, 4);

        System.out.println("After 4 years  : "+ c.getTime());

        c.add(Calendar.YEAR, -12);

        System.out.println("Before 12 years  : "+ c.getTime());

        c.add(Calendar.MONTH,2);

        System.out.println("After 2 months  : "+ c.getTime());

        System.out.println("\n");



//       we can also custom time zones we required, by mentioning in the calender funtion as below..

        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

        System.out.println(c1.getCalendarType());  //getCalendarType() returns the type of the calendar

        System.out.println(c1.getTimeZone().getID()); //getid returns the timezone



    }

}

