package com.java;

public class StringCompare {
    public static void main(String[] args)
    {
        String s1 = "Luffy";
        String s2 = "Luffy";

        String s3 = new String("Zoro");
        String s4 = "LUFFY";
        String s5 = "Sanji";

        // String compare with Equal  --> compares origiinal content of string
        System.out.println("String compare with Equal  --> compares origiinal content of string");
        System.out.println(s1.equals(s2));  //true
        System.out.println(s1.equals(s3));  //true
        System.out.println(s1.equals(s4));  //false
        System.out.println(s1.equalsIgnoreCase(s4));  //true
        System.out.println();

        // String compare with ( == ) operator  --> The == operator compares references not values
        System.out.println("String compare with ( == ) operator  --> The == operator compares references not values");
        System.out.println(s1 == (s2));  //true
        System.out.println(s1 == (s3));  //true
        System.out.println(s1 == (s4));  //false
        System.out.println();

        // String compare with CompareTo() Method  -->  compares values lexicographically and returns an integer value
        // that describes if first string is less than, equal to or greater than second string.
        //Suppose s1 and s2 are two String objects.
        //s1 == s2 : The method returns 0.
        //s1 > s2 : The method returns a positive value.
        //s1 < s2 : The method returns a negative value.
        System.out.println("String compare with CompareTo() Method  -->  compares values lexicographically and returns an integer value");
        System.out.println(s1.compareTo(s2));  // 0, because "Luffy" is the same as "Luffy"
        System.out.println(s1.compareTo(s3));  // -14, because 'L' (76) is less than 'Z' (90)
        System.out.println(s3.compareTo(s1));  // 14, because 'Z' (90) is greater than 'L' (76)
        System.out.println(s1.compareTo(s5));  // -7, because 'L' (76) is less than 'S' (83)
        System.out.println(s5.compareTo(s1));  // 7, because 'S' (85) is less than 'L' (76)

    }
}
