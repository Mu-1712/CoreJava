package com.java;

public class Encapsulation{

    private double balance;
    private String accountNumber;

    public Encapsulation(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public double getbalance(){
        return balance;
    }

    public String getaccountNumber(){
        return accountNumber;
    }

    public void deposit(double amount){
        if(balance > 0){
            balance += amount;
            System.out.println("Deposited amount is : " + balance );
        }else {
            System.out.println("Insuffient Funds");
        }
    }

    public void withdraw(double amount){
        if(balance > 0 && balance > amount){
            balance -= amount;
            System.out.println("Withdrawn amount is : " + amount + " , New balance is : " +balance);
        }else{
            System.out.println("Account is Empty");
        }
    }
}
class Bank {
    public static void main(String[] args){
        Encapsulation en = new Encapsulation("12345678765",15000);

        System.out.println("AccountNumber: " + en.getaccountNumber());

        en.deposit(500.0);
        en.withdraw(200.0);
        en.withdraw(2000.0);
        en.withdraw(14000.0); // Insufficient funds

    }
}