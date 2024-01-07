package com.java;

import java.util.Scanner;



public class NestedTryCatch2 {

    public static void main(String[] args) {

        int marks[] = new int[5];

        marks[0] = 3;

        marks[1] = 4;

        marks[2] = 5;

        marks[3] = 6;

        marks[4] = 7;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Index value: ");

        int i = sc.nextInt();

        Boolean flag = true;

        while (flag){

            try {

                System.out.println("Welcome to the world");

                try {

                    System.out.println(marks[i]);

                    flag = false;

                } catch (ArrayIndexOutOfBoundsException e) {

                    System.out.println("Not valid: Reason:" + e);

                    System.out.println(e);

                }

            }

            catch (Exception e)

            {

                System.out.println("Exception in level 1");

            }

        }

        System.out.println("visit again..thank you..");

    }

}