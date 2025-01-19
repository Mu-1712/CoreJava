package com.java;

public class StringBuilderClass {
    public static void  main(String[] args){

        //StringBuilder Class append() Method
        StringBuilder bf = new StringBuilder("Hello ");
        bf.append("World");
        System.out.println(bf);

        //StringBuilder Class insert() Method
        StringBuilder bf1 = new StringBuilder("Crazy ");
        bf1.insert(3,"Cat");
        System.out.println(bf1);

        //StringBuilder Class replace() Method
        StringBuilder bf2 = new StringBuilder("java ");
        bf2.replace(2,4,"version21");
        System.out.println(bf2);

        //StringBuilder Class replace() Method
        StringBuilder bf3 = new StringBuilder("java version21 ");
        bf3.delete(2,4);
        System.out.println(bf3);

        //StringBuilder Class reverse() Method
        StringBuilder bf4 = new StringBuilder("java is fav Language ");
        bf4.reverse();
        System.out.println(bf4);

        //StringBuilder Class capacity() Method
        StringBuilder bf5 = new StringBuilder();
        System.out.println(bf5.capacity());  //16
        bf5.append("CoreJava");
        System.out.println(bf5.capacity()); //16
        bf5.append("java is my favourite language");
        System.out.println(bf5.capacity());  //37

        //StringBuilder Class ensureCapacity() Method
        StringBuilder bf6 = new StringBuilder();
        System.out.println(bf6.capacity());  //16
        bf6.append("CoreJava");
        System.out.println(bf6.capacity()); //16
        bf6.append("java is my favourite language");
        System.out.println(bf6.capacity());  //37
        bf6.ensureCapacity(10);//now no change
        System.out.println(bf6.capacity());//now 37
        bf6.ensureCapacity(50);//now (37*2)+2
        System.out.println(bf6.capacity());//now 76
    }
}
