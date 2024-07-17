package com.java;

class Base {

    //Instance of operator
    {
        System.out.println("I am Instance of Operator");
    }
    Base(){
        System.out.println("i am a base constructor");
    }

    //Overloaded Constructor of Main class i.e. Base class
    Base(int x){
        System.out.println("Value of x is:" +x);
    }

    int x;

    public int getX() {
        return x;
    }

    public void setX() {
        this.x = x;
    }
}

class derived extends Base{

    //Constructor of subclass i.e. derived class
    derived(){
        System.out.println("i am a derived constructor");
    }

    //Parameterized Constructor of subclass class i.e. derived
    derived(int x, int y){
        super(x);
        System.out.println("i am a derived constructor");
        System.out.println("Value of y is:" +y);
    }
    int y;
    public int gety() {
        return y;
    }

    public void sety() {
        this.y = y;
    }
}

class ChildOfDerived extends derived{

    //Parameterized Constructor of  super subclass class i.e. ChildOfDerived

    ChildOfDerived(int x, int y,int z){
        super(x,y);
        System.out.println("i am a child of derived constructor");
        System.out.println("Value of z is:" +z);
    }
}

public class InheritanceConstructor {

    public static void main(String[] args) {

//        Base b = new Base();
//        derived d = new derived();
        //ChildOfDerived cd = new ChildOfDerived(10, 15, 20);
    }
}

//first goes to constructor of ChildOfDerived then super(x,y) in ChildOfDerived

// then goes to Overloaded derived constructor then super(x) in that,

// finally goes to Base constructor. Executes it.

//later executes Overloaded derived constructor.

//later executes constructor of ChildOfDerived.