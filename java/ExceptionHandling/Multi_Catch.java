package com.java;

import java.util.Scanner;

public class Multi_Catch {

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
        System.out.println("Enter the divider");
        int divider = sc.nextInt();

        try {
            System.out.println("value at entered index is: " +marks[i]);
            System.out.println("result  is: " +marks[i]/divider);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not valid: Reason:" +e);
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println("Arthematic exception: Reason:" +e);
            System.out.println(e);
        }
    }
}