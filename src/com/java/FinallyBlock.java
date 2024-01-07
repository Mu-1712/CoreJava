package com.java;

public class FinallyBlock {

    public static int add() {

        try {

            int a = 50;

            int b = 5;

            int c = a/b;

            return c;

        } catch (Exception e) {

            System.out.println(e);

        }

        finally {

            System.out.println("This is the end of this function");

        }

        return 0;

    }

    public static void main(String[] args) {

        int x = add();

        System.out.println(x);



        int a = 7;

        int b = 9;

        while(true){

            try{

                System.out.println(a/b);

            }

            catch (Exception e){

                System.out.println(e);

                break;

            }

            finally{

                System.out.println("I am finally for value of b = " + b);

            }

            b--;

        }



        try{

            System.out.println(50/3);

        }

        finally {

            System.out.println("Yes this is finally");

        }

    }

}

