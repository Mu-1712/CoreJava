package com.java.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static  void main(String[] args){

       TreeSet<String> ts = new TreeSet<String>();
        ts.add("C");
       ts.add("A");
        ts.add("E");
       ts.add("B");
       ts.add("D");

        //Printing Elements in acsending order, which is default in Treeset
        System.out.println("Printing Elements in acsending order");
       Iterator<String> i = ts.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

       ////Printing Elements in descending order
        System.out.println("Printing Elements in descending order");
        Iterator i1 = ts.descendingIterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }

        //TreeSet NavigableSet operations
        System.out.println("TreeSet NavigableSet operations");
        System.out.println("Reverse TreeSet: " +ts.descendingSet());
        System.out.println("Head TreeSet: " +ts.headSet("C", true));
        System.out.println("Subset TreeSet: " +ts.subSet("B", false, "E", true));
        System.out.println("Tail TreeSet: " +ts.tailSet("C", false));

        //TreeSet SortedSet operations
        System.out.println("TreeSet SortedSet operations");
        System.out.println("Reverse TreeSet: " +ts.descendingSet());
        System.out.println("Head TreeSet: " +ts.headSet("C"));
        System.out.println("Subset TreeSet: " +ts.subSet("B", "E"));
        System.out.println("Tail TreeSet: " +ts.tailSet("C"));

    }
}
