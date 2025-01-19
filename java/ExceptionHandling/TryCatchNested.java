package com.java;

import java.util.Scanner;

public class TryCatchNested {
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

            try { //Outer Try
                System.out.println("Outer Try Block");

                try { //Inner Try block02
                    System.out.println(marks[i]);
                } catch (ArrayIndexOutOfBoundsException e) { //Outer Ctach Block02
                    System.out.println("Not valid: Reason:" + e);
                }
                try{ //Inner Try block01
                    int a = marks[i]/0;
                }catch (ArithmeticException e){ //Outer Ctach Block01
                    System.out.println("Exception handles");
                }
            }
            catch (Exception e) //Outer Catch Block
            {
                System.out.println("Outer Catch Block");
            }
        System.out.println("Program Ends");
        }

    }
