package com.java.Collections;
 import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        //Add Method
        System.out.println("Add() Method In HashSet");
        set.add("Aa");
        set.add("Bb");
        set.add("Cc");
        set.add("Dd");
        set.add("Dd"); //doesnt add bcuz its duplicate
        System.out.println("The size of Set is : " + set.size());
        System.out.println("Initial Elements" +set);

//        Iterator<String> i = set.iterator();
//        while(i.hasNext()){ //it eleminates the duplicate elements
//            System.out.println(i.next());
//        }

        //Adding second Hashset elements to the first HashSet
        Set<String> anotherSet = new HashSet<>();
        System.out.println("Adding Elements to set");
        anotherSet.add("Ee");
        anotherSet.add("Ff");
        set.addAll(anotherSet);
        System.out.println("HashSet after adding all elements from another collection: " + set);

        // Check if HashSet contains an element
        System.out.println("HashSet contains 'Bb': " + set.contains("Bb"));

        // Check if HashSet contains all elements from another collection
        System.out.println("HashSet contains all elements from anotherSet: " + set.containsAll(anotherSet));

        // Remove an element
        set.remove("Bb");
        System.out.println("HashSet after removing 'Bb': " + set);

        // Remove() Method:
        set.remove(3);
        System.out.println("After invoking remove(index) method: "+set);

        // Remove all elements from another collection
        set.removeAll(anotherSet);
        System.out.println("HashSet after removing all elements from anotherSet: " + set);

        // Retain only the elements that are contained in another collection
        set.add("Hh");
        set.add("Gg");
        anotherSet.add("Ii");
        set.retainAll(set);
        System.out.println("HashSet after retaining elements from anotherSet: " + set);
        // Clear the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);

        // Check if the HashSet is empty
        System.out.println(" Check if the HashSet is empty: " + set.isEmpty());

        // Convert HashSet to array
        Object[] array = set.toArray();
        System.out.print("Array: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();





        //HashSet from another Collection
        System.out.println("HashSet from another Collection");
        ArrayList<String> op = new ArrayList<String>();
        op.add("Luffy");
        op.add("Zoro");
        op.add("Sanji");

        //here we are passing "op ArrayList which is other collection, to hashset"
        //we can also declare Hashset as Below
        HashSet<String> set2 = new HashSet(op);
        set2.add("Nami");
        Iterator<String> itr = set2.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

