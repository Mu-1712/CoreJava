package com.java.Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args){

        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        //add() method
        System.out.println("Add() Method's In HashMapEx");
        hm.put(1, "Luffy");
        hm.put(2, "Zoro");
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
        hm2.put(6, "Chopper");
        hm2.put(7, "Nami");
        hm2.put(8, "Sanji");
        hm.putAll(hm2);
        System.out.println("Adding second HashMap elements to the First HashMap: " + hm);
        System.out.println();

        //Remove() Method
        //Removing specific element using key/value from HashMap
        System.out.println("Remove() Method's In HashMap");
        hm.remove("Robin");  //value-based removal
        hm.remove(5);  //key-based removal
        System.out.println("After invoking remove(value), remove(key), method: " + hm);

        //Removing element on the basis of specific position
        hm.remove(6,"Chopper");
        System.out.println("After invoking remove(key, value) method: " + hm);

        //Removing all the elements available in the list
        hm.clear();
        System.out.println("After invoking clear() method: " + hm);

}
}

