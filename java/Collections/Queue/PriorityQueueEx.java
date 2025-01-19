package com.java.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>();
        //Add Method
        System.out.println("Add() Method In PriorityQueue");
        queue.add("Aa");
        queue.add("Bb");
        queue.add("Cc");
        queue.add("Dd");
        queue.add("Dd");
        //here elemnet and peek retrieves the head elements, but dont remove
        System.out.println("HeadElement: "+queue.element());
        System.out.println("HeadElement: "+queue.peek());
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("PriorityQueue after removing two elements: ");
        Iterator itr1=queue.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
