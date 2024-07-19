package com.java.Collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTableEx {
    public static void main(String[] args){
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(1, "A");
        ht.put(2,"B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");

        System.out.println("Initial HashTable" +ht);
        for(Map.Entry m: ht.entrySet()){
            System.out.println(m.getKey() +" "+ m.getValue());
        }

        //PutifAbsent() Method
        ht.putIfAbsent(6, "F");
        System.out.println("Updated Map: "+ht);

        //Remove() Method
        System.out.println("Remove() Method");
        System.out.println("key-based removal");
        ht.remove(6);  //key-based removal
        System.out.println("After invoking remove(key), method: " + ht);

        //getorDefault Method
        System.out.println("getorDefault Method");
        System.out.println(ht.getOrDefault(5, "Not Found")); //E
        System.out.println(ht.getOrDefault(7, "Not Found")); //Not Found

    }
}
