package com.java;

class Watch{

    public void Music(){
        System.out.println("Music from watch");
    }

    public void activate(){
        System.out.println("Watch is activating.....");
    }
}

class SmartWatch extends Watch{

    public void On(){
        System.out.println("i am SmartWatch");
    }

    @Override
    public void activate(){
        System.out.println("SmartWatch is activating.....");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {

        Watch obj = new SmartWatch();

        //SmartWatch obj2 = new Watch(); not ALLOWED.....

        obj.Music();
        obj.activate();

        // ALLOWED.....when two classes are set to equal,

        // then it is called "DYNAMIC METHOD DISPATCH"



        //Here the method (activated) which is overridden

        // can be considered as "METHOD OVERLOADING"





//        obj.On(); can't be executed....In Java, when you have a reference of a superclass type,
//        you can only call the methods that are defined in that superclass.
//        This is because the compiler checks the type of the reference, not the type of the actual object.
//        The reference obj is of type Watch, and the Watch class does not have a method On().
//        Therefore, you cannot call obj.On() directly.

    }

}

