package com.java.Collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeQueueExample {
    public static void main(String[] args) {

        //Queue Implementation Using ArrayDeque
        System.out.println("Queue Implementation Using ArrayDeque");
        ArrayDeque<String> queue = new ArrayDeque<>();

        //Offer Method, Deque Example
        System.out.println("Offer() Method In Queue");
        queue.offer("Aa");
        queue.offer("Bb");
        queue.offerLast("Cc");  //offer and offerLast are same, they add element at the end
        queue.offerFirst("Dd");
        queue.offerFirst("Ee");
        System.out.println(queue);

        System.out.println("Traversing Of Queue elements");
        Iterator itr=queue.iterator();  //Traversing Of Queue elements
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Peek() methods of Queue: ");
        System.out.println("Peek: " + queue.peek());
        System.out.println("Peek First: " + queue.peekFirst()); //peek and peekFirst are same, they give element from the top
        System.out.println("Peek Last: " + queue.peekLast());

        // Poll() methods of Queue
        System.out.println("Poll() methods of Queue: ");
        System.out.println("Poll: " + queue.poll());
        System.out.println("Poll First: " + queue.pollFirst());
        System.out.println("Poll Last: " + queue.pollLast());
        System.out.println("Stack after poll: " + queue); // Output the final state of the queue
        System.out.println();

        //Stack Implementation Using ArrayDeque
        ArrayDeque<String> stack = new ArrayDeque<>();
        //Push Method, in stack
        System.out.println("Stack Implementation Using ArrayDeque");
        System.out.println("Push() Method In Stack");
        stack.push("Aa");
        stack.push("Bb");
        stack.push("Cc");
        stack.push("Dd");
        stack.push("Ee");
        System.out.println(stack);

        System.out.println("Traversing Of Stack elements");
        Iterator itr1=stack.iterator(); //Traversing Of Stack elements
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        //Peek() methods of Stack
        System.out.println("Peek() methods of Stack: ");
        System.out.println("Peek: " + stack.peek());
        System.out.println("Peek First: " + stack.peekFirst());
        System.out.println("Peek Last: " + stack.peekLast());

        // Pop() methods of Stack
        System.out.println("Pop() methods of Queue: ");
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pops: " + stack);  // Output the final state of the Stack

    }
}



