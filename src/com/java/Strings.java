package com.java;

import java.util.Scanner;



public class Strings {

    public static void main(String[] args) {

        /* program to convet strings from one case to another?



        String name = "Musharaf";

        name = name.toLowerCase();

        System.out.println(name);*/



        /* Write a Java program to replace spaces with underscores?



        String name = "   Muhammed   ";

        name = name.replace(" ", "_");

        System.out.println(name); */



      /*  Write a Java program to fill in a letter template which looks like below:

         //letter = â€œDear <|name|>, Thanks a lotâ€

        //Replace <|name|> with a string (some name)?



        String letter = "Dear <|name|>, Thanks a lot!";

        letter = letter.replace("<|name|>", "Sachin");

        System.out.println(letter); */



        String myString = "This string contains double and  triple spaces";

        System.out.println(myString.indexOf("  "));

        System.out.println(myString.indexOf("   "));



        // Problem 5

        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";

        System.out.println(myLetter);

    }

}