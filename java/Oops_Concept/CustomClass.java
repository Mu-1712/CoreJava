package com.java;

class Employe{

    int salary;

    int id;

    String name;

    public int getSalary(){

        return salary;

    }

    public String getName(){

        return name;

    }

    public void setName(String m){

        name = m;

    }

    public void getdetails(){

        System.out.println("Employee name is :" + name);

        System.out.println("Id is: " +id);

        // System.out.println(Musharraf.setName);

        System.out.println("Salary is:"+salary);

    }

}

class Mobile{

    public void ring(){

        System.out.println("com.company.Mobile is ringing.");

    }

    public void vib(){

        System.out.println("com.company.Mobile is in vibrate mode.");

    }

    public void silent(){

        System.out.println("com.company.Mobile is in silent mode.");

    }

}

class Square{



    int side, area, perimeter;

    public int getArea(){

        area = side * side;

        System.out.println("Area of com.company.Square is:" +area);

        return area;

    }

    public int getPer(){

        perimeter = 4*side;

        System.out.println("Perimeter of com.company.Square is:" + perimeter);

        return perimeter;

    }

}

class games{

    public void hit(){

        System.out.println("Capable of hitting");

    }

    public void run(){

        System.out.println("Capable of running");

    }

    public void fire(){

        System.out.println("Capable of firing");

    }

}

public class CustomClass {

    public static void main(String[] args) {



        // Setting attributes for class Employee!

        Employe musharraf = new Employe();

        musharraf.id = 41;

        musharraf.salary = 30000;

        musharraf.setName("mushi");

        musharraf.getdetails();



        // Setting attributes for class com.company.Mobile!

        Mobile iphone = new Mobile();

        iphone.ring();

        iphone.vib();

        iphone.silent();



        // Setting attributes for class com.company.Square!

        Square sq = new Square();

        sq.side = 4;

        sq.getArea();

        sq.getPer();





        games player1 = new games();

        player1.hit();

        player1.run();

        player1.fire();



//        System.out.println(Musharraf.getName());

//        System.out.println(Musharraf.id);

//        System.out.println(Musharraf.setName);

//        System.out.println(Musharraf.getSalary());





    }

}