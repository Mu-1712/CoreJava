package com.java.Collections.List;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        //Stack Implementation using stack
        Stack<String> stck = new Stack<>();
        //Inbuilt Stack push() method
        System.out.println("Add() Method's In Stack");
        stck.push("Luffy");
        stck.push("Zoro");
        stck.push("Sanji");
        System.out.println("Initial Names: " + stck);

        //IInbuilt Stack pop() method
        stck.pop();
        System.out.println("After Invoking pop() method" + stck);

        //IInbuilt Stack peek() method, it gives top element but dont remove
        stck.peek();
        System.out.println("After Invoking peek() method" + stck);

        //IInbuilt Stack empty() method,
        System.out.println("After Invoking empty() method" + stck.empty());

        //Implementing Stack using List and Collection Methods
        System.out.println("/Implementing Stack using List and Collection Methods");
        List<String> stck2 = new Stack<>();
        //add() method
        System.out.println("Collection's Add() Method's In Stack");
        stck2.add("Luffy");
        stck2.add("Zoro");
        stck2.add("Sanji");
        System.out.println("Initial Names: " + stck2);
        // //Adding second stack elements to the first stack
        List<String> stck3 = new Stack<>();
        stck3.add("Vegeta");
        stck3.add("Gohan");
        stck2.addAll(stck3);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: " + stck2);

        //Adding third list elements to the first list at index 01
        ArrayList<String> stck4 = new ArrayList<String>();
        stck4.add("Tanjiro");
        stck4.add("Zenitsu");
        stck2.addAll(0, stck4);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: " + stck2); //[Tanjiro, Zenitsu, Luffy, Goku, Zoro, Sanji, Vegeta, Gohan]

        //Remove() Method
        //Removing specific element from stack
        System.out.println("Remove() Method's In Stack");
        stck2.remove("Sanji");
        System.out.println("After invoking remove(object) method: " + stck2);

        //Removing element on the basis of specific position
        stck2.remove(0);
        System.out.println("After invoking remove(index) method: " + stck2);

        //Removing all the stck3() elements from arraylist
        stck2.removeAll(stck3);
        System.out.println("After removing stck3() elements from Stack:" + stck2);

        //Removing elements on the basis of specified condition
        stck2.removeIf(str -> str.contains("Zenitsu"));   //Here, we are using Lambda expression
        System.out.println("After invoking removeIf() method: " + stck2);

        //Removing all the elements available in the list
        stck2.clear();
        System.out.println("After invoking clear() method: " + stck2);

    }
}
