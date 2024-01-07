package com.java;

import java.util.*;
public class LinkedList2{
    public static void main(String args[]){
        LinkedList<String> ll=new LinkedList<String>();
        System.out.println("Initial list of elements: "+ll);
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        System.out.println("After invoking add(E e) method: "+ll);
        //Adding an element at the specific position
        ll.add(1, "Gaurav");
        System.out.println("After invoking add(int index, E element) method: "+ll);
        LinkedList<String> ll2=new LinkedList<String>();
        ll2.add("Sonoo");
        ll2.add("Hanumat");
        //Adding second list elements to the first list
        ll.addAll(ll2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);
        LinkedList<String> ll3=new LinkedList<String>();
        ll3.add("John");
        ll3.add("Rahul");
        //Adding second list elements to the first list at specific position
        ll.addAll(1, ll3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);
        //Adding an element at the first position
        ll.addFirst("Lokesh");
        System.out.println("After invoking addFirst(E e) method: "+ll);
        //Adding an element at the last position
        ll.addLast("Harsh");
        System.out.println("After invoking addLast(E e) method: "+ll);

    }
}


//        LinkedList<Integer> l1 = new LinkedList<>();
//
//        LinkedList<Integer> l2 = new LinkedList<>();
//
//        l2.add(15);
//
//        l2.add(18);
//
//        l2.add(19);
//
//
//
//        l1.add(6);
//
//        l1.add(7);
//
//        l1.add(4);
//
//        l1.add(6);
//
//        l1.add(0, 5);
//
//        l1.add(0, 1);
//
//        l1.addAll(0, l2);
//
//        l1.addLast(676);
//
//        l1.addFirst(788);
//
//        System.out.println(l1.contains(27));
//
//        System.out.println(l1.indexOf(6));
//
//        System.out.println(l1.lastIndexOf(6));
//
//        //l1.clear();
//
//        l1.set(1, 566);
//
//        for(int i=0; i<l1.size(); i++){
//
//            System.out.print(l1.get(i));

//            System.out.print(", ");
//
//        }
//
//    }
//
//}