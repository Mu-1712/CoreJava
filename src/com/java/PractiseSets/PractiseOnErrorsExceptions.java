package com.java;

import java.util.Scanner;

//class MxRetriesException extends Exception{

//public String toString() {

//        return "indexoutof bound";

//    }

//

//    @Override

//    public String getMessage() {

//        return "indexoutof bound";

//    }

//}





public class PractiseOnErrorsExceptions {

//    public static int max(int i, int index)throws MxRetriesException{

//        if (i>=5){

//            throw new MxRetriesException();

//        }

//        boolean a = i>index;

//        return a;

//    }

    public static void main(String[] args) {



//        try {

//            int x = 50 / 0;

//        } catch (IllegalArgumentException e) {

//            System.out.println("hehe..hehe");

//        } catch (ArithmeticException e) {

//            System.out.println("haha..haha..");

//        }

        boolean flag = true;

        int[] marks = new int[3];

        marks[0] = 7;

        marks[1] = 56;

        marks[2] = 6;

        Scanner Sc = new Scanner(System.in);

        int index;

        int i = 0;

        while (flag && i < 5) {

            try {

                System.out.println("Enter the value of index");

                index = Sc.nextInt();

                System.out.println("The value of marks[index] is " + marks[index]);



                break;

            } catch (Exception e) {

                System.out.println("Invalid Index");

                i++;

            }

        }



//                if (i>=5){

//                    System.out.println(exc.getMessage());

//                }

    }

}