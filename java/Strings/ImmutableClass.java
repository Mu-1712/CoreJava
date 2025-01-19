package com.java;

 final class Client{
     final String pancardNumber;
     public Client(String pancardNumber) {
         this.pancardNumber = pancardNumber;
     }
     public String getpandcardNumber() {
         return pancardNumber;
     }
 }
    public class ImmutableClass {
    public static void main(String[]args){
                Client cl = new Client("A1B2C3");
                String s1 = cl.getpandcardNumber();
                System.out.println("PancardNumber is: "+ s1);
    }
}
