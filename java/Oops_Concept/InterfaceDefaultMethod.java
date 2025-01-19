package com.java;

interface Camera{

    void takesnap();

    void recordvideo();

    private void greet(){

        System.out.println("Good Morning");

    }

    default void record4kvideo(){

        System.out.println("4k clip...");

    }

}

interface wifi{

    String [] getnetwork();

    void Connecttowifi();

}

class mobile{

    public void Callnumber(int phonenumber){

        System.out.println("calling.." +phonenumber);

    }

    public void holdCall(){

        System.out.println("Call on hold...");

    }

}

class phone extends mobile implements Camera, wifi{

    public void takesnap(){

        System.out.println("taking snap...");

    }

    public void recordvideo(){

        System.out.println("video recording started..");

    }

    @Override

//    public void record4kvideo(){

//        System.out.println("recording in 4k");

//    }

    public String [] getnetwork(){

        System.out.println("getting networks in range...");

        String [] networklist = {"Jio 5g, jio 4g, Airtel 5g, Airtel 4g"};

        return networklist;

    }

    public void Connecttowifi(){

        System.out.println("connecting....");

    }

}

public class InterfaceDefaultMethod{

    public static void main(String[] args) {

        phone pn = new phone();

        pn.takesnap();  // interface1 method accessed...



        String [] arr = pn.getnetwork();  // interface2 method accessed...

        for (String item: arr) {

            System.out.println(item);

        }

        pn.holdCall();  // Class phone method accessed...

        pn.record4kvideo();  // if the method is ovveride, then the overridden method is executes, else default method in interface will be executed..

        // pn.greet();  cannot be acceses bcuz it is in private...

    }

}

