package com.programs;

import java.util.Scanner;

public class MultiplicationTable {
    public static  void main (String[] args){
                int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num =  sc.nextInt();
        if(num > 0){
            for(i=1; i<=10; i++){
                System.out.format("%d * %d = %d \n", num, i, num*i);
            }
        }
        else{System.out.println("Enter number greater then 0");
        }
    }
}
