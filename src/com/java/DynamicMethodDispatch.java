package com.java;

class Watch{

    public void Music(){

        System.out.println("i am watch");

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



        // ALLOWED.....when two classes are set to equal,

        // then it is called "DYNAMIC METHOD DISPATCH"



        //Here the method (activated) which is overridden

        // can be considered as "METHOD OVERLOADING"



        Watch obj = new SmartWatch();

        //SmartWatch obj2 = new Watch(); not ALLOWED.....

        obj.Music();

        obj.activate();

//        obj.On(); can't be executed....

    }

}

