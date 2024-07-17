package com.java.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList02 {
    public static void main(String[] args){

        LinkedList<String> Students = new LinkedList<String>();

        //add() method
        System.out.println("Add() Method's In LinkedList");
        Students.add("Luffy");
        Students.add("Zoro");
        Students.add("Sanji");
        System.out.println("Initial Names: " +Students);

        Students.add(1, "Goku");
        System.out.println("After Invoking add(int index, E element) method" +Students);

        // //Adding second list elements to the first list
        LinkedList<String> Students2 = new LinkedList<String>();
        Students2.add("Vegeta");
        Students2.add("Gohan");
        Students.addAll(Students2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+Students);

        //Adding third list elements to the first list at index 01
        LinkedList<String> Students3 = new LinkedList<String>();
        Students3.add("Tanjiro");
        Students3.add("Zenitsu");
        Students.addAll(0, Students3);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+Students); //[Tanjiro, Zenitsu, Luffy, Goku, Zoro, Sanji, Vegeta, Gohan]

        //Remove() Method
        //Removing specific element from arraylist
        System.out.println("Remove() Method's In LinkedList");
        Students.remove("Goku");
        System.out.println("After invoking remove(object) method: "+Students);

        //Removing element on the basis of specific position
        Students.remove(0);
        System.out.println("After invoking remove(index) method: "+Students);

        //Removing all the Students2() elements from arraylist
        Students.removeAll(Students2);
        System.out.println("After removing Students2() elements from arraylist:" +Students);

        //Removing elements on the basis of specified condition
        Students.removeIf(str -> str.contains("Zenitsu"));   //Here, we are using Lambda expression
        System.out.println("After invoking removeIf() method: "+Students);

        //Removing first element from the list
        Students.removeFirst();
        System.out.println("After invoking removeFirst() method: "+Students);

        //Removing first element from the list
        Students.removeLast();
        System.out.println("After invoking removeLast() method: "+Students);

        //Removing first occurrence of element from the list
        Students.removeFirstOccurrence("Goku");
        System.out.println("After invoking removeFirstOccurrence() method: "+Students);

        //Removing last occurrence of element from the list
        Students.removeLastOccurrence("Gohan");
        System.out.println("After invoking removeLastOccurrence() method: "+Students);

        //Removing all the elements available in the list
        Students.clear();
        System.out.println("After invoking clear() method: "+Students);


        //Traversing the list of elements in reverse order
        LinkedList<String> reverse = new LinkedList<String>();
        reverse.add("Zenitsu");
        reverse.add("Muzan");
        reverse.add("Ubuyashki");

        System.out.println("Traversing the list of elements in reverse order");
        Iterator i = reverse.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
