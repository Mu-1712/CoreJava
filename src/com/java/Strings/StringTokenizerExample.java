package com.java;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void  main(String[] args){

        String s1 = "Hello,Everyone,have,a,nice,day";

        //1) hasmoreTokens() Method
        System.out.println("\nUsing hasmoreTokens():");
        StringTokenizer st = new StringTokenizer(s1, ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        //2) nextTokens() Method
        System.out.println("\nUsing nextTokens():");
        StringTokenizer st1 = new StringTokenizer(s1, ",");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

//        System.out.println("\nUsing nextTokens(String delim):");
//        // 3) nextTokens(String Delim) Method  --> depricated in String Tokenizer
//        StringTokenizer st2 = new StringTokenizer(s1, ",");
//        while (st2.hasMoreTokens()) {
//            System.out.println(st2.nextToken(","));
//        }


        //4) countTokens() Method
        System.out.println("\nUsing CountTokens():");
        StringTokenizer st3 = new StringTokenizer(s1, ",");
        System.out.println("Total tokens: " + st3.countTokens());
        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }
//
        //5) hasMoreElemets() Method
        System.out.println("\nUsing hasMoreElemets():");
        StringTokenizer st4 = new StringTokenizer(s1, ",");
        while (st4.hasMoreTokens()) {
            System.out.println(st4.nextElement());
        }


        // 5) StringTokenizer(String str, String delim, boolean returnDelims)
        System.out.println("\nUsing StringTokenizer(String str, String delim, boolean returnDelims):");
        StringTokenizer st5 = new StringTokenizer(s1, ",", true);
        while (st5.hasMoreTokens()) {
            System.out.println(st5.nextToken());
        }
    }
}
