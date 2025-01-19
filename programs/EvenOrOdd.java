package com.programs;

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or character: ");

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0)
                System.out.println("Entered number is Even.");
            else
                System.out.println("Entered number is Odd.");
        } else if (sc.hasNextFloat()) {
            float f = sc.nextFloat();
            int n = (int) f; // Convert float to int
            if (n % 2 == 0)
                System.out.println("Entered float value is Even.");
            else
                System.out.println("Entered float value is Odd.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
