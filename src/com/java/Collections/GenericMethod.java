package com.java.Collections;

public class GenericMethod {
    public static void main(String[] args){
            printData("Hello");
            printData(1446);

            GenericMethod gmd = new GenericMethod();
//            gmd.doubleData("Hii");
            gmd.doubleData(1562);
    }
    static <E> void printData(E data){
        System.out.println(data);
    }
    //Bounded Generics
    //her E is Bounded to be only Number DataType,
    //Like int, float, double, etc....
    static <E extends Number> void doubleData(E data){
        System.out.println(data);
    }
}
