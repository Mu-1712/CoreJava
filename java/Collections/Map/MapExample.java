package com.java.Collections.Map;

import java.util.*;

public class MapExample {
    public static void main(String[] args){

        //Generic("New Style")
        System.out.println("Generic(\"New Style\")");
        Map<Integer,String> mp = new HashMap<>();
        mp.put(1, "Home");
        mp.put(2, "Apartment");
        mp.put(3, "Villa");
        mp.put(4, "Bangla");

        for(Map.Entry m: mp.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //Map Example: comparingByKey()
        System.out.println("Map Example: comparingByKey()");
        mp.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                //at atime only one Comparator work's, uncomment either one
                //.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);

        //Map Example: comparingByKey()
        System.out.println("Map Example: comparingByValue()");
        mp.entrySet()
                .stream()
                //.sorted(Map.Entry.comparingByValue())
                //at atime only one Comparator work's, uncomment either one
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
