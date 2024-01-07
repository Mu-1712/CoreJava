package com.java;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;



public class DateTimeFormatters {

    public static void main(String[] args) {



        // to print time frst we should take localdatetime and after that we have to set datetimeformat

        //then with help of string, localdatetime and datetimeformat are formatted fro required result

        LocalDateTime dt = LocalDateTime.now(); // This is the date

        System.out.println(dt);



        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format

        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;



        String myDate = dt.format(df); // Creating date string using date and format

        System.out.println(myDate);

    }

}