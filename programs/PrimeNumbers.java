package com.programs;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int startnum = sc.nextInt();

        System.out.println("Enter second value");
        int endnum = sc.nextInt();
        System.out.println("List of prime numbers between " + startnum + " and " + endnum);

        for (int i = startnum; i <= endnum; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }
        public static boolean isPrime(int num){
            if (num <= 1) {
                return false;
            }
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0)
                        return false;
                }
                return true;
        }

}
