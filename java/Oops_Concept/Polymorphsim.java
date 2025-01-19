package com.java;

//Complie-Time or Static Binding
class MethodOverloading{
    int x, y, z;
    public int add(int x, int y){
        return x + y;
    }
    public int add(int x, int y, int z){
        return x + y + z;
    }
}

//Run-Time or Dynamic Binding
class MethodOverriding{
    public void defaultMethod(){
        System.out.println("This is a Default Method");
    }
    public void defaultMethod02(int x, int y){
        System.out.println("This is a Another Default Method");
    }
}

class OverridingMethod extends MethodOverriding{
   @Override
    public void defaultMethod(){
        System.out.println("This Default Method is Overridden");
    }
    @Override
    public void defaultMethod02(int x, int y){
        System.out.println("This Another Default Method is Overriden");
    }
}
public class Polymorphsim {
    public static void main(String[] args){

        //Complie-Time or Static Binding
        System.out.println("Complie-Time Polymorphism or Static Binding");

        MethodOverloading ml = new MethodOverloading();
                          int sum01 = ml.add(5, 6);
        System.out.println("Sum of two digits : " + sum01);
                          int sum02 = ml.add(5, 7, 8);
        System.out.println("Sum of three digits : " + sum02);
        System.out.println("\n");

        //Run-Time or Static Binding
        System.out.println("Run-Time Polymorphism or Dynamic Binding");

        OverridingMethod mo = new OverridingMethod();
        mo.defaultMethod();
        mo.defaultMethod02(3,9 );

        MethodOverriding mo2 = new MethodOverriding();
        mo2.defaultMethod();
        mo2.defaultMethod02(3,9 );
    }
}
