package com.java;

abstract class Vehicle{

    public abstract void drive();

}

@FunctionalInterface  //method which contain only one method in class

interface Holidays{

    public void summer();



}

// general way to execute a interface class with another class

// by defining methods in the parent class and call them...



//class vacation implements Holidays{

//    public void summer(){

//        System.out.println("i am enjoying my vacation");

//    }

//}



// general way to execute a class with another class by defining methods in the parent class



//class Vehicle2 extends Vehicle{

//    public void drive(){

//        System.out.println("i am a heavy driver");

//    }

//}





//Execcuting a interface class with Lamda Expresion

@FunctionalInterface

interface LambaExp{

    void meth1(int a, int b);

}





public class LamdaExp_AnonymousClass {

    public static void main(String[] args) {

//            Vehicle2 BMW = new Vehicle2();

//               vacation vac = new vacation();

//               vac.summer();



        //executing Anonymous class by extending method...

        Vehicle BMW = new Vehicle() {

            @Override

            public void drive() {

                System.out.println("i am a heavy driver");

            }

        };

        BMW.drive();

        //executing Anonymous class by Interface method...

        Holidays h = new Holidays() {

            @Override

            public void summer() {

                System.out.println("i am enjoying my vacation");

            }

        };

        h.summer();



        //Execcuting a interface class with Lamda Expresion..syntax given below

        LambaExp obj =(a,b)->{

            System.out.println("The value of a and b is : "+ a + "," + b);

        };

        obj.meth1(5,10);

    }

}
