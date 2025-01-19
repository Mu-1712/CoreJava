package com.java.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListInterfaces {
    public  static void main(String[] args){

        //example of List where we are using the ArrayList class as the implementation.
        System.out.println("example of List where we are using the ArrayList class as the implementation.");
        List<String> l = new ArrayList<>();
        l.add("Bhugati");
        l.add("Mercedees");
        l.add("Mushtang");

        for (String car:l){
            System.out.println(car);
        }

        //Conerting Array to List
        System.out.println("Converting Array to List");
        String[] cats = { "Persians", "Bengals", "Ragdolls","Scottish Folds"};
        System.out.println("Printing Array: " + Arrays.toString(cats));

        List<String> list = new ArrayList<>();
        for (String lang: cats ){
            list.add(lang);
        }
        System.out.println("Printing List: " + list);

        //Converting List to Array
        System.out.println("Converting List to Array");
        List<String> bikelist = new ArrayList<>();
        bikelist.add("Fz-S V4");
        bikelist.add("Pulsor 220");
        bikelist.add( "MT 15");
        bikelist.add("Bullet");

        String[] bikes = bikelist.toArray(new String[bikelist.size()]);
        System.out.println("Printing Array: " + Arrays.toString(bikes));
        System.out.println("Printing List: " + bikelist);

        //get and set methods
        System.out.println("get and set methods");
        System.out.println("Returning Element: " +bikelist.get(2));
        bikelist.set(2, "KTM");
        for (String elements: bikelist){
            System.out.println(elements);
        }

        //Sorting
        System.out.println("Sorting");
        Collections.sort(bikelist);
        for (String elements: bikelist){
            System.out.println(elements);
        }
    }
}
