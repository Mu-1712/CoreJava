package com.java;

import java.util.ArrayDeque;

public class ArrayDequeue {

    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();

        ad1.add(5);

        ad1.add(2);

        ad1.add(3);

        ad1.addFirst(45);

        ad1.addLast(55);

        System.out.println(ad1.getFirst());

        System.out.println(ad1.getLast());

    }

}

