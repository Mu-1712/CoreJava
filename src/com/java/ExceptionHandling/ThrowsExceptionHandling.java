package com.java;

import java.io.IOException;
//There are two cases:
//Case 1: We have caught the exception i.e. we have handled the exception using try/catch block.
//Case 2: We have declared the exception i.e. specified throws keyword with the method.

//Case 1: Handle Exception Using try-catch block
//class M{
//    void method() throws IOException{
//        throw new IOException("device error");
//    }
//}
//public class ThrowsExceptionHandling {
//    public static void main(String[] args){
//        try
//        {
//           M m = new M();
//           m.method();
//        }catch (Exception e){
//            System.out.println("Exception Handled");
//        }
//    }

//Case 2: Declare Exception
class N{
    void method01() throws IOException{
        throw new IOException("device error");
    }
}
public class ThrowsExceptionHandling {
    public static void main(String[] args) throws IOException{ //declare exception

           N n = new N();
           n.method01();
            System.out.println("Normal flow of code");

    }

}
