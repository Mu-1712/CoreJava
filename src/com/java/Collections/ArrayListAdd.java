package com.java;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args){
        ArrayList<String> Students = new ArrayList<String>();
        //add() method
        System.out.println("Add() Method's In ArrayList");
        Students.add("Luffy");
        Students.add("Zoro");
        Students.add("Sanji");
        System.out.println("Initial Names: " +Students);

        Students.add(1, "Goku");
        System.out.println("After Invoking add(int index, E element) method" +Students);

        // //Adding second list elements to the first list
        ArrayList<String> Students2 = new ArrayList<String>();
        Students2.add("Vegeta");
        Students2.add("Gohan");
        Students.addAll(Students2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+Students);

        //Adding third list elements to the first list at index 01
        ArrayList<String> Students3 = new ArrayList<String>();
        Students3.add("Tanjiro");
        Students3.add("Zenitsu");
        Students.addAll(0, Students3);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+Students); //[Tanjiro, Zenitsu, Luffy, Goku, Zoro, Sanji, Vegeta, Gohan]

        //Remove() Method
        //Removing specific element from arraylist
        System.out.println("Remove() Method's In ArrayList");
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

        //Removing all the elements available in the list
        Students.clear();
        System.out.println("After invoking clear() method: "+Students);

    }
}
