package com.programs;
import java.util.Scanner;

public class Palindrome_Armstrong {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        if(isArmstrong(num)){
            System.out.println(num + " is Armstrong number");
        }else{
            System.out.println(num + " not a Armstrong number");
        }
    }

    private static boolean isPalindrome(int num) {
        int temp = num;
        int rem = 0;
        while (temp != 0) {
            int digit = temp % 10;
            rem = rem * 10 + digit;
            temp = temp / 10;
        }
        return num == rem;
    }

    private static boolean isArmstrong(int num) {
        int number = num, rem, result = 0, n=0;
        while(num!=0){
            num/=10;
            ++n;
        }
        num = number;
        while (num!=0){
            rem = num % 10;
            result += Math.pow(rem, n);
            num /= 10;
        }
        if (result == number){return true;}
        else {return false;}
    }
}