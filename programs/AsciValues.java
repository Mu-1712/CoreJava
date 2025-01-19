package com.programs;

import java.util.Scanner;

public class AsciValues {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter min value:");
        char ch = s.next().charAt(0);
        int asciiValue = ch;
        System.out.println("Asci value of " + ch + " is " + asciiValue);

        Syst2em.out.println("ASCII values of capital letters (A-Z):");
        for(int i = 65;i<=90;i++){
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
        }

        System.out.println("ASCII values of capital letters (A-Z):");
        for (int j = 97; j <= 122; j++) {
            System.out.println(" The ASCII value of " + (char) j + "  =  " + j);
        }

        System.out.println("All ASCII values:");
        for(int i = 0;i<=122;i++){
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
        }
    }
}