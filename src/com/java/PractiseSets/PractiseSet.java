package com.java;

abstract class pen{

    abstract void write();

    abstract void refill();

}

class Fountainpen extends pen{

    public void write(){

        System.out.println("Pen writes smooth..");

    }

    public void refill(){

        System.out.println("Ink finisehd..Plz refil it..");

    }

    public void changeNib(){

        System.out.println("chnage nib to ball..");

    }

}



interface basicanimal{

    void eat();

    void sleep();

}

class monkey{

    public void jump(){

        System.out.println("the monkey jumps and climbs any tree..");

    }

    public void bite(){

        System.out.println("the monkey bites..");

    }

}

class human extends monkey implements basicanimal{



    public void eat(){

        System.out.println("lion hunts and satisfies his hunger..");

    }

    public void sleep(){

        System.out.println("Owl sleeps at nyt");

    }

    @Override

    public void jump(){

        System.out.println("the monkey jumps and climbs any tree..");

    }

    @Override

    public void bite(){

        System.out.println("the monkey bites..");

    }

}

abstract class telephone{

    abstract void lift();

    abstract void disconnect();

}

class smart_telephone extends telephone{

    public void lift(){

        System.out.println("answer the call..");

    }

    public void disconnect(){

        System.out.println("call is disconnected..");

    }

}



interface remote{

    void turnOn();

    void turnOff();

}

interface smart_remote extends remote{

    void smartOn();

    void smartOff();

}

class Tv implements smart_remote{



    public  void smartOn(){

        System.out.println("Turning on tv by voice command..");

    }

    public void smartOff(){

        System.out.println("Turning off tv by voice command..");

    }

    public void turnOn(){

        System.out.println("turning on the Tv..");

    }

    public void turnOff(){

        System.out.println("turning off the Tv..");

    }

}



public class PractiseSet {

    public static void main(String[] args) {



        Fountainpen fpen = new Fountainpen();

        fpen.changeNib();

        fpen.refill();

        fpen.write();

        System.out.println("\n");



        human h = new human();

        h.bite();

        h.sleep();

        h.eat();

        System.out.println("\n");

        //polymorphism of class monkey..its just performs jump & bite.

        monkey m = new human();

        m.jump();

        m.bite();

        System.out.println("\n");

        //m.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method



        //polymorphism of class smart_telephone..its just performs disconnect & lift,

        // if any other classes then it wont that methods.

        telephone Tpn = new smart_telephone();

        Tpn.lift();

        Tpn.disconnect();

        System.out.println("\n");



        Tv v = new Tv();

        v.turnOn();

        v.turnOff();

        v.smartOn();

        v.smartOff();



    }

}