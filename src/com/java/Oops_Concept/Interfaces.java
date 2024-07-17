package com.java;

interface Car{

    int x = 35;

    public abstract void abreak(int decrement); //abstract Method

    //interface only have default and
    default void speedUp(){
        System.out.println("Car is SpeedingUp......");
    }
}

interface Car2{

    int a = 45;

    void horn();;//abstract Method

    // static methods along with abtract methods
    static void accelrate(){
        System.out.println("Car2 is Accelrating......");
    }
}

class BMW implements Car,Car2{

    public void Costlier(){
        System.out.println("Expensive Car");
    }
    //implementation of abstract abreak method
    public void abreak(int decrement){
        System.out.println("Break is Apllied, BMW slow by " + decrement +" kmph;");
    }
    //implementation of abstract horn method
    public void horn(){
        System.out.println("pee..pee..poo..poo");
    }
}

public class Interfaces {
    public static void main(String[] args) {

        BMW bmw = new BMW();
        // You can create properties in Interfaces
        System.out.println(bmw.a);
        bmw.Costlier();
        bmw.abreak(20);
        bmw.speedUp();
        Car2.accelrate();
        bmw.horn();


        // // You cannot modify the properties in Interfaces as they are final

//            bmw.a = 45;
//            System.out.println(bmw.a);
    }

}