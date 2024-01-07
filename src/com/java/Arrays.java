package com.java;

public class Arrays {

    public static void main(String[] args) {



        // Displaying Array using general way (naive way)?

        int [] marks = new int[5];

        marks [0] = 50;

        marks [1] = 60;

        marks [2] = 70;

        marks [3] = 80;

        marks [4] = 90;

        System.out.println(marks[4]);



        /* Displaying Array with for loop?

        int i;

        int [] marks = new int[5];

        marks [0] = 50;

        marks [1] = 60;

        marks [2] = 70;

        marks [3] = 80;

        marks [4] = 90;

        System.out.println("The length of Array is "+marks.length+"");

        for (i=0; i<marks.length; i++){

            System.out.println(marks[i]);

        }

         */



         /* Displaying Array in Reverse order with for loop?

        int i;

        int [] marks = new int[5];

        marks [0] = 50;

        marks [1] = 60;

        marks [2] = 70;

        marks [3] = 80;

        marks [4] = 90;

        System.out.println("The length of Array is "+marks.length+"");

        for (i=marks.length -1; i>=0; i--){

            System.out.println(marks[i]);

        }

        */



        /* Displaying Array with for-Each loop?

        int [] marks = new int[5];

        marks [0] = 50;

        marks [1] = 60;

        marks [2] = 70;

        marks [3] = 80;

        marks [4] = 90;

        System.out.println("The length of Array is "+marks.length+"");

        for (int element: marks){

            System.out.println(element);

        }

            */





    }



}