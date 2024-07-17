package com.java;

            class InvalidAgeException  extends Exception{
                    public InvalidAgeException(String str){
                        super(str);
                    }
            }

            public class CustomException {
                static void validate(int age) throws InvalidAgeException {
                    if (age < 18) {
                        throw new InvalidAgeException("age is nor valid");
                    } else {
                        System.out.println("Welcome to vote");
                    }
                }
                public static void main(String[] args) {
                    try {
                        validate(13);
                    } catch (InvalidAgeException e) {
                        System.out.println("Exception Handled");
                        System.out.println("Exception occured: " + e);
                    }
                    System.out.println("rest of the code...");
                }

            }
