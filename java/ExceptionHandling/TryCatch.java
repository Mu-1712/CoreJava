package com.java;

public class TryCatch {
    public static void main(String[] args){
        try{
            int a = 50/0;
        }catch (ArithmeticException e){  //Handling exception with inherited Exception
            System.out.println(e);
        }
        System.out.println("rest of the code of try block1");

        try{
            int a = 30/0;
        }catch (Exception e){ //Handling exception with parent Exception
            System.out.println(e);
        }
        System.out.println("rest of the code of try block2");
        //if we kept any statement inside try block,
        //then the statement wont excute if exception occures, as below
        try{
            int a = 40/0;
            System.out.println("rest of the code of try block3");
        }catch (Exception e){ //Handling exception with parent Exception
            System.out.println(e);
        }
    }
}
