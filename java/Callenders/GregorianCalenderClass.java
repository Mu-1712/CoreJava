package com.java;

import java.util.*;

public class GregorianCalenderClass {

    public static void main(String[] args) {

        GregorianCalendar cal = new GregorianCalendar();

        System.out.println(cal.isLeapYear(2000));

        System.out.println(cal.isLeapYear(2021));

        System.out.println("\n");



//        roll(int field, boolean up) :

//        This method adds/subtracts a single unit of time from the specified time field.

//        true = rolls up the value by 1.

//          false = rolls down the value by 1.

        System.out.println("Date before rolling : " + cal.getTime());

        cal.roll(Calendar.MONTH, true);

        cal.roll(Calendar.DATE, false);

        cal.roll(Calendar.YEAR, true);

        System.out.println("Date after rolling : " + cal.getTime());

        System.out.println("\n");



//        hashcode():

//        This method returns the hashcode of the calendar object

        System.out.println("Calendar : " + cal.getTime());

        System.out.println("The hashcode for this calendar is : "+ cal.hashCode());

        System.out.println("\n");



        System.out.println(TimeZone.getAvailableIDs()[0]); //returns all available ids supported

        System.out.println(TimeZone.getAvailableIDs()[1]);

        System.out.println(TimeZone.getAvailableIDs()[2]);

    }

}