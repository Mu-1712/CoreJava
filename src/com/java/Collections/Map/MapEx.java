package com.java.Collections;

import java.util.*;

public class MapEx {
    public static void main(String[] args){

        //Non-Generic("Old Style")
        System.out.println("Non-Generic(\"Old Style\")");
        Map map = new HashMap();
        map.put(1, "Home");
        map.put(2, "Apartment");
        map.put(3, "Villa");
        map.put(4, "Bangla");

        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

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
        map.entrySet()
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
