package com.java;

abstract class Parent{
    public void Parent(){
        System.out.println("I am a Parent Constructor");
    }
    public void sayHi(){
        System.out.println("Hi Bro");
    }
    abstract void greet();
    abstract void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    @Override
    public void greet2() {
        System.out.println("namaste guru garu");
    }
}
abstract class Child2 extends Parent{
    public void sayHello(){
        System.out.println("good afternoon");
    }
}
public class AbstractOops {
    public static void main(String[] args) {
//                Parent p = new Parent();
//                Child2 ch2 = new Child2();  (Abtract Classes can't be called....throw errors)
        Child ch = new Child();
        ch.greet();
        ch.greet2();
    }
}

