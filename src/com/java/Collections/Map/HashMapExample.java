package com.java.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args){

        Map<Integer,String> hm = new HashMap<Integer, String>();
        //add() method
        System.out.println("Add() Method's In HashMapExample");
        hm.put(1, "Luffy");
        hm.put(2, "Zoro");
        hm.put(2, "Zoro"); //duplicates are not allowed
        hm.put(3, "Sanji");
        System.out.println("Initial keys and values: " + hm);
        System.out.println();

        //putIfAbsent() method
        hm.putIfAbsent(4, "Robin");
        hm.putIfAbsent(5, "Franky");
        System.out.println("After invoking putIfAbsent() method: " +hm);
        System.out.println();

        // //Adding second HashMap elements to the First HashMap
        HashMap<Integer,String> hm2 = new HashMap<Integer, String>();
        hm2.put(6, "Nami");
        hm2.put(7, "Sanji");
        hm.putAll(hm2);
        System.out.println("Adding second HashMap elements to the First HashMap: " + hm);
        System.out.println();

        //get()
        System.out.println("get() Method: " +hm.get(4));

        //getorDefault()
        System.out.println("getorDefault() " +hm.getOrDefault(8, "NotFound"));
        System.out.println("getorDefault() " +hm.getOrDefault(2, "NotFound"));

        //contains()
        System.out.println("Check if Nami is there in map: " +hm.containsValue("Nami"));
        System.out.println("Check if 7 is there in map: " +hm.containsKey(7));

        //replace(K,V), replaces the value of key K with new specified value of V
        System.out.println(hm.replace(5, "Chopper"));
        System.out.println("After replace(K,V): " +hm);

        //replace(K,oldValue, newValue), replaces the value of key K with new specified value of V
        System.out.println(hm.replace(6, "Nami", "Nami-San"));
        System.out.println("After replace(K,oldValue, newValue): " +hm);


        //Removing specific element using key from HashMap
        System.out.println("Remove() Method's In HashMap");
        hm.remove(5);  //key-based removal
        System.out.println("After invoking remove(key), method: " + hm);

        //Removing element on the basis of specific position
        hm.remove(6,"Nami-San");
        System.out.println("After invoking remove(key, value) method: " + hm);

        //keySet() -returns set of all keys in a Map
        System.out.println("set of all keys in a Map: " +hm.keySet());

        //Values() -returns set of all values in a Map

        System.out.println("set of all values in a Map: " +hm.values());

        //entrySet-returns set of all values in a Map
        System.out.println("set of all values/keys in a Map: " +hm.entrySet());

        hm.clear();
        System.out.println("After invoking clear() method: " + hm);

}
}

