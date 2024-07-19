package com.java.Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx { //TreeMap is almost same as TreeSet
    public static void main(String[] args){
    TreeMap<Integer, String> ts = new TreeMap<Integer, String>();
       ts.put(1, "A");
       ts.put(2,"B");
       ts.put(3, "C");
       ts.put(4, "D");
       ts.put(5, "E");
       ts.put(6, "F");

        for(Map.Entry m: ts.entrySet()){
            System.out.println(m.getKey() +" "+ m.getValue());
        }

        //Remove() Method
        System.out.println("Remove() Method");
        System.out.println("key-based removal");
        ts.remove(6);  //key-based removal
        System.out.println("After invoking remove(key), method: " + ts);

        //TreeMap NavigableMap operations
        System.out.println("TreeMap NavigableMap operations");
        System.out.println("Reverse TreeMap: " +ts.descendingMap());
        System.out.println("Head TreeMap: " +ts.headMap(2, true));
        System.out.println("Subset TreeMap: " +ts.subMap(3, false, 5, true));
        System.out.println("Tail TreeMap: " +ts.tailMap(3, false));

        //TreeMap SortedMap operations
        System.out.println("TreeMap SortedMap operations");
        System.out.println("Reverse TreeMap: " +ts.descendingMap());
        System.out.println("Head TreeMap: " +ts.headMap(3));
        System.out.println("Subset TreeMap: " +ts.subMap(2, 5));
        System.out.println("Tail TreeMap: " +ts.tailMap(3));

}
}
