package com.java;

public class StringBufferClass {
    public static void  main(String[] args){

        //StringBuffer Class append() Method
        StringBuffer bf = new StringBuffer("Hello ");
        bf.append("World");
        System.out.println(bf);

        //StringBuffer Class insert() Method
        StringBuffer bf1 = new StringBuffer("Crazy ");
        bf1.insert(3,"Cat");
        System.out.println(bf1);

        //StringBuffer Class replace() Method
        StringBuffer bf2 = new StringBuffer("java ");
        bf2.replace(2,4,"version21");
        System.out.println(bf2);

        //StringBuffer Class replace() Method
        StringBuffer bf3 = new StringBuffer("java version21 ");
        bf3.delete(2,4);
        System.out.println(bf3);

        //StringBuffer Class reverse() Method
        StringBuffer bf4 = new StringBuffer("java is fav Language ");
        bf4.reverse();
        System.out.println(bf4);

        //StringBuffer Class capacity() Method
        StringBuffer bf5 = new StringBuffer();
        System.out.println(bf5.capacity());  //16
        bf5.append("CoreJava");
        System.out.println(bf5.capacity()); //16
        bf5.append("java is my favourite language");
        System.out.println(bf5.capacity());  //37

        //StringBuffer Class ensureCapacity() Method
        StringBuffer bf6 = new StringBuffer();
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
