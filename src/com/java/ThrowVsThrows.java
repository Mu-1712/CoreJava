package com.java;

class NegativeRadiusException extends Exception{

    @Override

    public String toString() {

        return "Radius can't be negative!";

    }



//    @Override

//    public String getMessage() {

//        return "Radius can't be negative!";

//    }

}



public class ThrowVsThrows {

    public static double area(int r) throws NegativeRadiusException{

        if (r<0){

            throw new NegativeRadiusException();

        }

        double A = Math.PI*r*r;

        return  A;



    }

    public static int divide(int a, int b) throws ArithmeticException{

        int result = a/b;

        return result;

    }

    public static void main(String[] args) {

        try{

//            int c = divide(8,0);

//            System.out.println(c);

            double A = area(-5);

            System.out.println("Area is: " +A);

        }

        catch (Exception e){

            System.out.println(e);

        }

    }

}