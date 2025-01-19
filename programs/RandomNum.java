package com.programs;

import java.util.Scanner;

public class RandomNum {
    public static  void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter min value:");
        int minvalue = s.nextInt();

        System.out.println("Enter max value:");
        int maxvalue = s.nextInt();

        System.out.println("Random Numbers b/w " +minvalue+ "and " + maxvalue );
        int a = (int)(Math.random()*(maxvalue-minvalue+1)+minvalue);
        System.out.println(a);
    }
}
