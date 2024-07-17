package com.java;

abstract class Shape {
    protected double area;

    public abstract void calculateArea();

    public void printArea(){
        System.out.println("The area of Shape is  :" + area);
    }
}

class Circle extends Shape{
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle (double length, double width ){
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = length * width;
    }
}

 class BankAccount{
    private double balance;

    public void deposit(double amount){
        balance += amount;
    }

     public double withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Insufficient Funds");
        }
         return amount;
     }
     public double getBalance() {
         return balance;
     }
     public double getwithdraw() {
         return withdraw(balance);
     }
 }
public class OopsConcept_Code {
    public static void main (String[] args){
               Shape shape1 = new Circle(4.0);
               shape1.calculateArea();
               shape1.printArea();

                Shape shape2 = new Rectangle(4.0, 5.0);
                shape2.calculateArea();
                shape2.printArea();

                BankAccount account = new BankAccount();
                account.deposit(10000);
                account.getBalance();
                System.out.println("Balance: " + account.getBalance()); // Output: Balance: 1000.0
                account.withdraw(5000);
                System.out.println("Withdraw Amount: " + account.getwithdraw()); // Output: Balance: 1000.0

    }
}
