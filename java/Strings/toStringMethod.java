package com.java;

public class toStringMethod {
    int rollno;
    String Name;
    String city;

    public toStringMethod(int rollno, String Name, String city) {
        this.rollno = rollno;
        this.Name = Name;
        this.city = city;
    }

    //if we run this code without override method the output will be wrng.
    // below is the output without toString() method
    //    com.java.toStringMethod@6acbcfc0
    //    com.java.toStringMethod@5f184fc6
    //    com.java.toStringMethod@3feba861
    //    com.java.toStringMethod@5b480cf9

    @Override
    public String toString() {
        return rollno + " " + Name + " " + city;
    }

    public static void main(String[] args) {
        toStringMethod S = new toStringMethod(101, "Luffy", "East Blue");
        toStringMethod Ss = new toStringMethod(102, "Zoro", "West Blue");
        System.out.println(S);      // Output: 101 Luffy East Blue
        System.out.println(Ss);     // Output: 102 Zoro West Blue

        toStringMethod S1 = new toStringMethod(101, "Luffy", "East Blue");
        toStringMethod Ss1 = new toStringMethod(102, "Zoro", "West Blue");
        System.out.println(S1);      // Output: 101 Luffy East Blue
        System.out.println(Ss1);     // Output: 102 Zoro West Blue
    }
}
