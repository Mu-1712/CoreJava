package com.programs;

import java.util.Scanner;

public class FibnociSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int num = sc.nextInt();
        int prev=0, cur=1;
        int i;
        System.out.print(prev+ " " + cur);
        for(i=1; i<=num; i++){
            int nxt = prev + cur;
            System.out.print(" " + nxt);
            prev = cur;
            cur = nxt;
        }
    }

}
