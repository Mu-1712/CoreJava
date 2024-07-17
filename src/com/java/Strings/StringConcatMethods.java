package com.java;

public class StringConcatMethods {
    public static void main(String[]args){
        String s1 = "Monkey";
        String s2 = " D.Luffy";

        //String Concat using + Operator
        System.out.println("String Concat using + Operator");
        String s3 = s1 + s2;
        System.out.println(s3);
        System.out.println(40+40 +s3+ 40+40); // + after string consider as string + opertor

        //String Concat using concat() Operator
        System.out.println("String Concat concat() Operator");
        System.out.println(s1.concat(s2));

        //String Concat using StringBuilder append() Method
        System.out.println("String Concat using StringBuilder append() Method");
        StringBuilder sb1 = new StringBuilder("Monkey");
        StringBuilder sb2 = new StringBuilder(" D.Luffy");
        System.out.println(sb1.append(sb2));

        //String Concat using StringBuilder join() Method
        System.out.println("String Concat using StringBuilder join() Method");
        StringBuilder sb3 = new StringBuilder("Roronora");
        StringBuilder sb4 = new StringBuilder(" Zoro");
        String sj = String.join("", sb3,sb4);
        System.out.println(sj);

        //String Concat using StringBuilder format() Method
        System.out.println("String Concat using StringBuilder  format() Method");
        StringBuilder sb5 = new StringBuilder("Dr");
        StringBuilder sb6 = new StringBuilder(".Chopper");
        String sf = String.format("%sb5%sb6", sb5,sb6);
        System.out.println(sf);

    }
}
