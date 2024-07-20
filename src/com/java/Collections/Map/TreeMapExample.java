package com.java.Collections.Map;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args){

        Map<String,String> tm = new TreeMap<String, String>();
        //add() method
        System.out.println("Add() Method's In TreeMapExample");
        tm.put("4A1", "Luffy");
        tm.put("4A2", "Zoro");
        tm.put("4A2", "Zoro"); //duplicates are not allowed
        tm.put("4A3", "Sanji");
        System.out.println("Initial keys and values: " + tm);
        System.out.println();

        //putIfAbsent() method
        tm.putIfAbsent("4A4", "Robin");
        tm.putIfAbsent("4A5", "Franky");
        System.out.println("After invoking putIfAbsent() method: " +tm);
        System.out.println();

        // //Adding second TreeMap elements to the First TreeMap
        Map<String,String> tm2 = new TreeMap<String, String>();
        tm2.put("4A6", "Nami");
        tm2.put("4A7", "Sanji");
        tm.putAll(tm2);
        System.out.println("Adding second TreeMap elements to the First TreeMap: " + tm);
        System.out.println();

        //get()
        System.out.println("get() Method: " +tm.get("4A4"));

        //getorDefault()
        System.out.println("getorDefault() " +tm.getOrDefault("4A7", "NotFound"));
        System.out.println("getorDefault() " +tm.getOrDefault("4A9", "NotFound"));

        //contains()
        System.out.println("Check if Nami is there in map: " +tm.containsValue("Nami"));
        System.out.println("Check if 7 is there in map: " +tm.containsKey("4A7"));

        //replace(K,V), replaces the value of key K with new specified value of V
        System.out.println(tm.replace("4A5", "Chopper"));
        System.out.println("After replace(K,V): " +tm);

        //replace(K,oldValue, newValue), replaces the value of key K with new specified value of V
        System.out.println(tm.replace("4A6", "Nami", "Nami-San"));
        System.out.println("After replace(K,oldValue, newValue): " +tm);


        //Removing specific element using key from TreeMap
        System.out.println("Remove() Method's In TreeMap");
        tm.remove("4A5");  //key-based removal
        System.out.println("After invoking remove(key), method: " + tm);

        //Removing element on the basis of specific position
        tm.remove("4A6","Nami-San");
        System.out.println("After invoking remove(key, value) method: " + tm);

        //keySet() -returns set of all keys in a Map
        System.out.println("set of all keys in a Map: " +tm.keySet());

        //Values() -returns set of all values in a Map

        System.out.println("set of all values in a Map: " +tm.values());

        //entrySet-returns set of all values in a Map
        System.out.println("set of all values/keys in a Map: " +tm.entrySet());

        tm.clear();
        System.out.println("After invoking clear() method: " + tm);

    }
}

