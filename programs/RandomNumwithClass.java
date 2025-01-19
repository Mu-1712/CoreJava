package com.programs;

import java.util.Random;

public class RandomNumwithClass {
    public static void main (String[] args){
        Random random = new Random();
        int times=6;
        int i=0;
        while(i < times){
            int x = random.nextInt(10);
            System.out.print(x +","+"");
            i++;
        }
    }
}
