package com.java;

import java.util.Arrays;
import java.util.Scanner;



public class Strings_itzMethods {

    public static void main(String[] args) {

        //String Object Creation
        String s1 = "    string created with string literal!     ";  //creating string by string literall

        char ch[] = {'s', 't', 'r', 'i', 'n', 'g'};
        String s2 = new String(ch); // converting charaters into Strings

        String s3 = new String("String created by new Keyword"); //creating string by new Keyword

        String s4 =new String("Luffy");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //Most used Methods of String
        System.out.println("Most used Methdos of String: ");

        // Length(
        System.out.println("s3 string length : " + s3.length());
        System.out.println("s1 string length : " + s1.length());

        //Trim()
        System.out.println("trim s3 : " + s1.trim());

        //CharAt()
        System.out.println("char at index 3 in string s3 : " + s3.charAt(3));

        //SubString()
        System.out.println("subString of String s3 : " + s3.substring(7, 17));

        //Cpncatination
        System.out.println("Concatenation of s1 & s3 : " + s1.concat(s3));

        //Equal()
        System.out.println("Equality of s1 & s3 : " + s1.equals(s3));

        //EqualIgnoreCase
        System.out.println("Equality of s1 & s3(IgnoreCase) : " + s1.equalsIgnoreCase(s3));

        //getBytes
        String s6 = "ABCDEF";
        byte[] barr  = s6.getBytes();
        for (int i=0; i<barr.length; i++){
            System.out.println(barr[i]);
        }
        // Getting string back
        String s7 = new String(barr);
        System.out.println(s6);

        //getChars
        StringBuffer bf = new StringBuffer("hello world");
        char[] charArray = new char[5];
         bf.getChars(6, 11, charArray, 0);
        System.out.println(Arrays.toString(charArray));

       //IndexOf(ch)
        System.out.println("Index of s in s1: " + s1.indexOf('s'));

        // lastIndexOf()
        System.out.println("Last index of 'i' in str1: " + s1.lastIndexOf('i'));

        // one char replace()
        System.out.println("Replacing 'y' with 'Z' in str3: " + s3.replace('y', 'Z'));

        // Char sequence replace()
        System.out.println("Replacing 'new Keyword' with 'Instance new' in str3: " + s3.replace("new Keyword", "Instance new"));

        // toLowerCase()
        System.out.println("s1 in lowercase: " + s1.toLowerCase());
        System.out.println("s2 in lowercase: " + s2.toLowerCase());
        System.out.println("s3 in lowercase: " + s3.toLowerCase());

        // toUpperCase()
        System.out.println("s1 in uppercase: " + s1.toUpperCase());
        System.out.println("s2 in uppercase: " + s2.toUpperCase());
        System.out.println("s3 in uppercase: " + s3.toUpperCase());

        //toCharArray
        char[] ch1 = s4.toCharArray();
        for (int i=0; i<ch1.length; i++){
            System.out.println(ch1[i]);
        }

        // split()
        String[] words = s3.split(" ");
        System.out.print("Words in str3: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        // intern()
        String s5 = s4.intern();
        System.out.println(s5);

        //valueof
        int a=10;
        String s=String.valueOf(a);
        System.out.println(s+10);

        // startsWith()
        System.out.println("str1 starts with 'string': " + s1.startsWith("string"));
        System.out.println("str2 starts with 'String': " + s2.startsWith("string"));

        // endsWith()
        System.out.println("str3 ends with 'word': " + s3.endsWith("word"));
        System.out.println("str1 ends with ' ': " + s3.endsWith(" "));

        // contains()
        System.out.println("str1 contains 'Literal': " + s1.contains("literal"));
        System.out.println("str2 contains 'new': " + s2.contains("new"));

        // isEmpty()
        String emptyStr = "";
        System.out.println("emptyStr is empty: " + emptyStr.isEmpty());
    }

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



//        String myString = "This string contains double and  triple spaces";
//
//        System.out.println(myString.indexOf("  "));
//
//        System.out.println(myString.indexOf("   "));
//
//
//
//        // Problem 5
//
//        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
//
//        System.out.println(myLetter);

    }
