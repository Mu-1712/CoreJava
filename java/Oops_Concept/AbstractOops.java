package com.java;

abstract class Parent{
    public void Parent(){
        System.out.println("I am a Parent Constructor");
    }
    public void sayHi(){
        System.out.println("Parents sayHi");
    }
    abstract void greet();
    abstract void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Child: good morning");
    }
    @Override
    public void greet2() {
        System.out.println("Child: namaste guru garu");
    }
}

abstract class Child2 extends Parent{
    public void sayHello(){
        System.out.println("Child2: sayHello");
    }
}

class GrandChild extends Child2 {
    @Override
    public void sayHello() {
        System.out.println("GrandChild: sayHello");
    }
    public void greet(){
        System.out.println("GrandChild: Good Afternoon");
    }
    @Override
    public void greet2() {
        System.out.println("GrandChild: Good NIght");
    }
}

    public class AbstractOops {
        public static void main(String[] args) {
//                Parent p = new Parent();
//                Child2 ch2 = new Child2();  (Abtract Classes can't be called directlty, called through sub classes....throw errors)
            Child ch = new Child();
            ch.Parent();
            ch.sayHi();
            ch.greet();
            ch.greet2();

            GrandChild ch2 = new GrandChild();
            ch2.sayHello();
            ch2.greet();
            ch2.greet2();

            Child2 ch3 = new GrandChild();
            ch3.sayHello();
            ch3.greet();
            ch3.greet2();

        }
    }

