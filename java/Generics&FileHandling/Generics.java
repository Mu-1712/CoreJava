package com.java;

import java.util.ArrayList;

import java.util.Scanner;



// We use < > to specify Parameter type

class MyGenerics<Z1, Z2>{

    int val;

    private Z1 z1;   // An object of type Z1..where z1 is obj

    private Z2 z2;  // An object of type Z2..where z2 is obj

    public MyGenerics(int val, Z1 z1, Z2 z2){

        this.val = val;

        this.z1 = z1;

        this.z2 = z2;

    }

    public int getVal() {

        return val;

    }

    public void setVal(int val) {

        this.val = val;

    }





    public Z1 getZ1() {

        return z1;

    }

    public void setZ1(Z1 z2) {

        this.z1 = z1;

    }



    public Z2 getZ2() {

        return z2;

    }

    public void setz2(Z2 z2) {

        this.z2 = z2;

    }

}



public class Generics {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList();

//        ArrayList<int> arrayList = new ArrayList(); -- this will produce an error

//        arrayList.add("str1");

        arrayList.add(54);

        arrayList.add(643);

//        arrayList.add(new Scanner(System.in));



        int a = (int) arrayList.get(0);

//        System.out.println(a);

        MyGenerics<String, Integer> g = new MyGenerics(78, "Hello Musharaf..", 89);

        String str = g.getZ1();

        Integer int1 = g.getZ2();

        System.out.println(str + int1);

    }

}