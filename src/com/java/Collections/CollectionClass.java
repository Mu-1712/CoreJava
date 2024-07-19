package com.java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args){

        List<String> list= new ArrayList<String>();
        list.add("Core Java");
        list.add("Java Advanced");
        list.add("JavScript");
        System.out.println("Initial List: " +list);
        Collections.addAll(list, "SQL", "Html"); //aading more elements to list
        System.out.println("UpadtedList: "+list);

        //creating an Array
        String[] arr = {"React.js", "Css"};
        Collections.addAll(list, arr); //Adding list and array
        System.out.println("Combining list and array: " +list);


    }
}
