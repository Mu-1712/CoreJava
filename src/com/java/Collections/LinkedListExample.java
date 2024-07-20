package com.java.Collections;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args){

        //LinkedList Implementation with Collection method
        System.out.println("LinkedList Implementation with Collection method");
        List<String> collection = new LinkedList<>();
        // Add elements
        collection.add("Aa");
        collection.add("Bb");
        collection.add("Cc");
        System.out.println("Collection after adding elements: " + collection);

        // Add all elements from another collection
        Collection<String> anotherCollection = new LinkedList<>();
        anotherCollection.add("Dd");
        anotherCollection.add("Ee");
        collection.addAll(anotherCollection);
        System.out.println("Collection after adding all elements from another collection: " + collection);

        // Sort LinkedList
        System.out.println("Sorting ArrayList Using Collections.sort() Method");
        Collections.sort(collection);
        for (String fruit : collection) {
            System.out.println(fruit);
        }

        // Check if collection contains an element
        System.out.println("Collection contains 'Bb': " + collection.contains("Bb"));

        // Check if collection contains all elements from another collection
        System.out.println("Collection contains all elements from anotherCollection: " + collection.containsAll(anotherCollection));

        // Remove an element
        collection.remove("Bb");
        System.out.println("Collection after removing 'Bb': " + collection);

        // Remove all elements from another collection
        collection.removeAll(anotherCollection);
        System.out.println("Collection after removing all elements from anotherCollection: " + collection);

        // Retain only the elements that are contained in another collection
        collection.add("Ff");
        collection.add("Gg");
        anotherCollection.add("Ff");
        collection.retainAll(anotherCollection);
        System.out.println("Collection after retaining elements from anotherCollection: " + collection);

        // Convert collection to array
        Object[] array = collection.toArray();
        System.out.print("Array: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // Clear the collection
        collection.clear();
        System.out.println("Collection after clearing: " + collection);

        // Check if the collection is empty
        System.out.println("Collection is empty: " + collection.isEmpty());
        System.out.println();


        //LinkedList Implementation with List method
        System.out.println("LinkedList Implementation with List method");
        LinkedList<String> Students = new LinkedList<String>();
        //add() method
        System.out.println("Add() Method's In LinkedList");
        Students.add("Luffy");
        Students.add("Zoro");
        Students.add("Sanji");
        System.out.println("Initial Names: " + Students);

        // Positional Access
        System.out.println("Positional Access");
        Students.add(1, "Gohan");
        System.out.println("After Invoking add(int index, E element) method: " + Students);

        //Adding Second list elements to the first list at index 01
        LinkedList<String> Students2 = new LinkedList<String>();
        Students2.add("Tanjiro");
        Students2.add("Zenitsu");
        Students.addAll(0, Students2); //we can also add without mentioning index value i.e, Students.addAll(Students3);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: " + Students); //[Tanjiro, Zenitsu, Luffy, Goku, Zoro, Sanji]

        // Get element at index
        System.out.println("Element at index 2: " + Students.get(2));

        // Set element at index
        Students.set(1, "Goku");
        System.out.println("List after setting 'Goku' at index 1: " + Students);

        // Index of elements
        System.out.println("Index of 'Luffy: " + Students.indexOf("Luffy"));
        System.out.println("Index of 'Zoro': " + Students.lastIndexOf("Zoro"));

        // List iterator
        System.out.println("List iterator from start:");
        Students.listIterator().forEachRemaining(System.out::println);

        // List iterator(int Index)
        System.out.println("List iterator from Specific Index:");
        Students.listIterator(2).forEachRemaining(System.out::println);

        // SubList
        List<String> subList = Students.subList(1, 3);
        System.out.println("SubList from index 1 to 3: " + subList);

        //Remove() Method
        //Removing specific element from arraylist
        System.out.println("Remove() Method's In LinkedList");
        Students.remove("Goku");
        System.out.println("After invoking remove(object) method: " + Students);

        //Removing element on the basis of specific position
        Students.remove(0);
        System.out.println("After invoking remove(index) method: " + Students);

        //Removing all the Students2() elements from arraylist
        Students.removeAll(Students2);
        System.out.println("After removing Students2() elements from arraylist:" + Students);

        //Removing elements on the basis of specified condition
        Students.removeIf(str -> str.contains("Sanji"));   //Here, we are using Lambda expression
        System.out.println("After invoking removeIf() method: " + Students);

        //Removing all the elements available in the list
        Students.clear();
        System.out.println("After invoking clear() method: " + Students);
        System.out.println();


        //LIst with Integer Type
        System.out.println("LIst with Integer Type");
        List<Integer> nums = new LinkedList<Integer>();
        //add() method
        System.out.println("Add() Method's In LinkedList");
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(1);
        System.out.println("Initial Numbers: " + nums);

        System.out.println("Removing Value at Index");
        nums.remove(1); //it removes number which is at index 1, which is 20
        System.out.println("Removing Value(20) at Index 01: " +nums); //[10, 30, 1]

        System.out.println("Removing obj using wrapperClass");
        nums.remove(Integer.valueOf(1)); //it removes actual obj which is 1 at index 3
        System.out.println("removes actual obj(1) at index 03: " +nums); //[10, 30]


    }
}
