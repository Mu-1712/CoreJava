package com.java;


 public class Arrays {

     //Passing Array to a Method in Java
     static void min(int arr[]){
         int min = arr[0];
         for(int i = 1; i < arr.length; i++){
             if (min > arr[i])
                 min = arr[i];
         }
         System.out.println("Passing Array to a Method in Java:");
         System.out.println("Min value is: " + min);
     }

     static void AnonymousArray(int arr[]){
         for(int j: arr){
             System.out.print(j + " ");
         }
     }

    public static void main(String[] args) {

        //Passing Array to a Method in Java
        int a[] = {33,40,50,20};
        min(a);
        System.out.println();

        // Displaying Array using general way (naive way)?
        int[] marks = new int[5];
        marks[0] = 50;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 80;
        marks[4] = 90;
        System.out.println("Elements of an array:");
        System.out.println("Element in index " +marks[4]);
        System.out.println();

        //AnonymouesArray
        System.out.println("AnonymousArray:");
        AnonymousArray(new int[] {1,2,3,4,5,6,7,8});
    }
}