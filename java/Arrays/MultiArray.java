package com.java;

public class MultiArray {



    public static void main(String[] args) {



        int i,j;

        int [][] marks = new int[3][3];

        marks [0][0] = 20;

        marks [0][1] = 30;

        marks [0][2] = 40;

        marks [1][0] = 50;

        marks [1][1] = 60;

        marks [1][2] = 70;

        marks [2][0] = 80;

        marks [2][1] = 90;

        marks [2][2] = 100;

        System.out.println("Printing a 2-D array using for loop");

        for (i=0; i<marks.length; i++) {

            for (j = 0; j < marks[i].length; j++) {

                System.out.print(marks[i][j]);

                System.out.print(" ");

            }

            System.out.println("");

        }

        System.out.println("length of array is " + marks.length + "");

    }

}

