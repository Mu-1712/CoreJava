package com.java;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_IteratingMethods {
    public static void main(String[] args) {

        // 1)ArrayList Example
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("ArrayList");
        list.add("Mangoes");
        list.add("Grapes");
        list.add("Berries");
        list.add("Watermelon");
        list.add("Apple");
        System.out.println(list);

        // 2) Iterating ArrayList Using Iterator
        System.out.println("Iterating ArrayList Using Iterator");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 3) Iterating ArrayList Using ListIterator
        System.out.println("Iterating ArrayList Using ListIterator");
        ListIterator<String> list1 = list.listIterator(list.size());
        while (list1.hasPrevious()){
            String str = list1.previous();
            System.out.println(str);
        }

        // 4) Iterating ArrayList Using For-each loop
        System.out.println("Iterating ArrayList Using For-each loop");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 5) Iterating ArrayList Using For loop
        System.out.println("Iterating ArrayList Using For loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 7)Traversing list through forEachRemaining() method:
        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<String> itr1=list.iterator();
        itr1.forEachRemaining(a-> //Here, we are using lambda expression
        {
            System.out.println(a);
        });
    }
}