package com.java.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterface {
    public static void main(String[] args){

        System.out.println("example of List where we are using the ArrayList class as the implementation.");
        List<String> l = new ArrayList<>();
        l.add("Bhugati");
        l.add("Mercedees");
        l.add("Mushtang");

        ListIterator<String> itr = l.listIterator();
        System.out.println("Traversing elements in Forward Direction: ");
        while (itr.hasNext()){
            System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
        }
        System.out.println("Traversing elements in Reverse Direction: ");
        while (itr.hasPrevious()){
            System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
        }
    }
}
