package com.java;

public class ArrayPractise {
    public static void main(String[] args) {

//        Create a Java program to add two 1-D matrices?

        int i;

        int [] marks = {10, 20, 30, 40, 50};

        int [] marks2 = {50, 40, 30, 20, 10};

        int [] result = new int[5];



        for (i=0; i<marks.length; i++)

        {

            result[i]= marks[i] + marks2[i];

            System.out.print(result[i]+ " ");

        }

//        Create an array of 5 floats and calculate their sum.?



//        int i, sum=0;

//        float [] marks = {10, 20, 30, 40, 50};

//        for (i=0; i<marks.length; i++)

//        {

//            sum += marks[i];

//            System.out.println(marks[i]);

//        }

//           System.out.println("The sum of 5 floats is: "+sum+"");



//        Calculate the average marks from an array containing marks

//        of all students in physics using a for-each loop?

//

//        int i=0, sum=0, avg=0;

//        int [] marks = {10, 20, 30, 40, 50};

//        for (int element: marks)

//        {

//            sum += element;

//        }

//        System.out.println("sum of students in physics is:" + sum);

//        System.out.println("Average of students in physics is:" + sum/ marks.length);



//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};

//        float num = 45.7f;

//        boolean isInArray = false;

//        for(float element:marks){

//            if(num == element){

//                isInArray = true;

//                break;

//            }

//        }

//        if(isInArray){

//            System.out.println("The value is present in the array");

//        }

//        else{

//            System.out.println("The value is not present in the array");

//        }





//        Create a Java program to add two 2-D matrices?

//        int [][] mat1 = {{1, 2, 3},

//                         {4, 5, 6}};

//        int [][] mat2 = {{2, 6, 13},

//                        {3, 7, 1}};

//        int [][] result = {{0, 0, 0},

//                            {0, 0, 0}};

//

//        for (int i=0;i<mat1.length;i++){ // row number of times

//            for (int j=0;j<mat1[i].length;j++) { // column number of time

//                System.out.format(" Setting value for i=%d and j=%d\n", i, j);

//                result[i][j] = mat1[i][j] + mat2[i][j];

//            }

//        }

//

//        // Printing the elements of a 2-D Array

//        for (int i=0;i<mat1.length;i++){ // row number of times

//            for (int j=0;j<mat1[i].length;j++) { // column number of time

//                System.out.print(result[i][j] + " ");

//                result[i][j] = mat1[i][j] + mat2[i][j];

//            }

//            System.out.println(""); // Prints a new line

//        }



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










        // System.out.println("Enter sum of "+i +"index" +" " + result[i]);

//          System.out.println(result[i]);



//        Write a Java program to find the maximum element in an array?

//        int marks[] = {1, 25, 48, 150, 230};

//        int max = Integer.MIN_VALUE;

//        for (int e:marks) {

//           if (e>max)

//               max = e;

//        }

//        System.out.println("the value of the maximum element in this array is: "+ max);





//       Write a Java program to find whether an array is sorted or not?



//        int i;

//        boolean isSorted = true;

//        int arr[] = {1, 5, 55, 12, 25, 28};

//        for (i=0; i<arr.length-1; i++){

//            if(arr[i] > arr[i+1]) {

//                isSorted = false;

//                break;

//            }

//        }

//        if (isSorted)

//            System.out.println("Array is sorted");

//        else

//            System.out.println("Array is not sorted");



//        Write a Java program to reverse an array.?

//        int [] arr = {1, 21, 3, 4, 5, 34, 67};

//        int l = arr.length;

//        int n = Math.floorDiv(l, 2);

//        int temp;

//

//        for(int i=0; i<n; i++){

//            // Swap a[i] and a[l-1-i]

//            // a   b   temp

//            // |4| |3| ||

//            temp = arr[i];

//            arr[i] = arr[l-i-1];

//            arr[l-i-1] = temp;

//        }

//

//        for(int element: arr){

//            System.out.print(element + " ");

//        }

    }




