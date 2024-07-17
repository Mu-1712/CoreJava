package com.java;

public class ThrowingUncheckedException {
    public static void validate(int age){
        if (age<18){
            throw new ArithmeticException("Age < 18, not eligible to Vote");
        }else {
            System.out.println("You can Vote");
        }
    }
    public static void main(String[] args){
        validate(17);
        System.out.println("Rest of the code");
    }
}
