    package com.programs;
    import java.util.Scanner;

    public class Factorail {
        public static  void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a value:");
            int fact=1, i;
            int n = sc.nextInt();
            for(i=1; i<=n; i++) {
                fact *= i;
            }
            System.out.printf("Factorial of %d is %d\n", n, fact);
            }
        }

