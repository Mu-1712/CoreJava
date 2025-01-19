package com.java;

public class CallingMethod {

    public static void main(String[] args) {



    /* Calling Method using Static?

    static int logic (int x,int y)

    {

        int z;

        if(x<y) {

            z = x + y;

        }

        else

            z = x * y;

         return z;

    }

    public static void main(String[] args) {



        int a = 5, b= 4;

        int c;

        c = logic(a,b);

        System.out.println(a + " "+ b);

        System.out.println(c);



        int a1 = 4, b1 = 5;

        int c1;

        c1 = logic(a1, b1);

        System.out.println(a1 +" "+ b1);

        System.out.println(c1);

                */



   /* Method invocation using Object creation, without Static?

     int logic (int x,int y)

    {

        int z;

        if(x<y) {

            z = x + y;

        }

        else

            z = x * y;

        return z;

    }

    public static void main(String[] args) {



        int a = 5, b= 4;

        int c;

       Multi_Arrays obj = new Multi_Arrays();

       c = obj.logic(a,b);

        System.out.println(a + " "+ b);

        System.out.println(c);



        int a1 = 4, b1 = 5;

        int c1;

        c1 = obj.logic(a1,b1);

        System.out.println(a1 +" "+ b1);

        System.out.println(c1);

            */

    }

}

