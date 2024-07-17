package com.java;

public class ThrowVsThrows {
    public static void thowexample(int num){
            if (num < 1){
                throw new ArithmeticException("Number is Negative");
            }
            else {
                System.out.println("Square of" + num + "is: " + (num*num));
            }
    }

    public static int thowsexample(int n, int m) throws ArithmeticException{
        int div = n/m;
        return div;
    }
    public static void main(String [] args){
        ThrowVsThrows thr = new ThrowVsThrows();
        try {
            thr.thowexample(-2);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            System.out.println(thr.thowsexample(45, 0));
        }
        catch (ArithmeticException e){
            System.out.println("\nNumber cannot be divided by 0");
        }

        System.out.println("Rest of the code..");
    }
}

















//class NegativeRadiusException extends Exception{
//
//    @Override
//
//    public String toString() {
//        return "Radius can't be negative!";
//    }
////    @Override
////    public String getMessage() {
////        return "Radius can't be negative!";
////    }
//}
//public class ThrowVsThrows {
//    public static double area(int r) throws NegativeRadiusException{
//        if (r<0){
//            throw new NegativeRadiusException();
//        }
//        double A = Math.PI*r*r;
//        return  A
//    }

//    public static int divide(int a, int b) throws ArithmeticException{
//        int result = a/b;
//        return result;
//    }
//    public static void main(String[] args) {
//        try{

////            int c = divide(8,0);
////            System.out.println(c);
//            double A = area(-5);
//            System.out.println("Area is: " +A);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//    }
//}