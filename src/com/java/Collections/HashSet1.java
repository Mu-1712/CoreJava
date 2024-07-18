package com.java.Collections;
 import java.util.*;

public class HashSet1{

    public static void main(String[] args) {

        HashSet<String> set = new HashSet();
        //Add Method
        System.out.println("Add() Method In HashSet");
        set.add("Aa");
        set.add("Bb");
        set.add("Cc");
        set.add("Dd");
        set.add("Dd");
        System.out.println("The size of Set is : " + set.size());
        System.out.println("Initial Elements" +set);

        Iterator<String> i = set.iterator();
        while(i.hasNext()){ //it eleminates the duplicate elements
            System.out.println(i.next());
        }

        //Adding second Hashset elements to the first HashSet
        Set<String> set1 = new HashSet<>();
        System.out.println("Adding Elements to set");
        set1.add("Ee");
        set1.add("Ff");
        set.addAll(set1);
        System.out.println("Updated List: "+set);

       // Remove() Method:
        set.remove(3);
        System.out.println("After invoking remove(index) method: "+set);

        // RemoveAll() Method:
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);

        //Removing elements on the basis of specified condition
        set.removeIf(str->str.contains("Dd"));
        System.out.println("After invoking removeIf() method: "+set);

        //Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method: "+set);


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

