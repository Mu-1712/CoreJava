package com.java;

class Games {

    private int id;

    private String name;

    //Constructor 1 without arguments

    public Games(){

        id = 234;

        name = "Musharraf";

    }

    //Constructor 2 with one arguments

    public Games(String myName){

        id = 45;

        name = myName;

    }



    //Constructor 3 with two arguments

    public Games(String s,int i){

        id = i;

        name = s;

    }

//the above constructor callings are constructor 0verloading



    // set and get are called as setters and getters

    // setter --> sets the value

    // getter --> returns the values

    public void setId(int i){this.id = i;}

    public int getId(){return id;}

    public void setName(String n){this.name = n;}

    public String getName(){return name;}



}

public class AccessModifiers_Constructors {

    public static void main(String[] args) {



        //Constructor 1 Calling

        Games gamer1 = new Games();



        //Constructor 2 Calling

        Games gamer2 = new Games("tanjiro");



        //Constructor 3 Calling

        Games gamer3 = new Games("Asta",78);



        //normal calling of a method

//        gm.setId(345);

//        gm.setName("I Love gaming");

        System.out.println(gamer1.getId());

        System.out.println(gamer1.getName());

        System.out.println(gamer2.getId());

        System.out.println(gamer2.getName());

        System.out.println(gamer3.getId());

        System.out.println(gamer3.getName());

    }

}
