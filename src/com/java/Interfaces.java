package com.java;

interface Car{

    int x = 35;

    void abreak(int decrement);

    void speedUp(int increment);

}

interface Car2{

    int a = 45;

    void horn();

    void accelrate();

}

//here the below implements two interfaces at the same time..

class BMW implements Car,Car2{

    public void Costlier(){

        System.out.println("Expensive Car");

    }

    public void abreak(int decrement){

        System.out.println("Break is Apllied;");

    }

    public void speedUp(int increment){

        System.out.println("Car is SpeedingUp;");

    }

    public void horn(){

        System.out.println("pee..pee..poo..poo");

    }

    public void accelrate(){

        System.out.println("Car2 to is ready to race..");

    }

}



public class Interfaces {

    public static void main(String[] args) {

        BMW bmw = new BMW();

        // You can create properties in Interfaces

        System.out.println(bmw.a);

        bmw.Costlier();

        bmw.abreak(3);

        bmw.speedUp(4);



        // // You cannot modify the properties in Interfaces as they are final

//            bmw.a = 45;

//            System.out.println(bmw.a);



        bmw.accelrate();

        bmw.horn();







    }

}