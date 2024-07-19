package com.java.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDeQueueEx {
    public static void main(String[] args) {

        Deque<String> queue = new ArrayDeque<>();
        //Add Method, ArrayDeque Example
        System.out.println("ArrayDeque Example");
        System.out.println("Add() Method In ArrayQueue");
        queue.add("Aa");
        queue.add("Bb");
        queue.add("Cc");
        queue.add("Dd");
        queue.add("Dd");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //Add Method, ArrayDeque Example: offerFirst() and pollLast()
        System.out.println("ArrayDeque Example: offerFirst() and pollLast()");
        Deque<String> dq = new ArrayDeque<String>();
        dq.offer("Aa");
        dq.offer("Bb");
        dq.add("Cc");
        dq.offerFirst("Dd");
        dq.offerFirst("Ee");
        System.out.println("After offerFirst Traversal...");
        for(String s:dq){
            System.out.println(s);
        }
        //deque.poll();
        //deque.pollFirst();//it is same as poll()
        dq.pollLast();
        
        System.out.println("After pollLast() Traversal...");
        for(String s:dq){
            System.out.println(s);
        }

    }
}
