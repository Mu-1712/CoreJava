package com.java.Collections;

class Cat<E>{       //Generic with Single DataType parameter
    E id; // here "E" means any "Data Type"
    public Cat(E id){
        this.id = id;
    }
    E getId(){
        return id;
    }
}
class Birds<M, N>{   //Generic with Multiple DataType parameter
    M id; // here "E" means any "Data Type"
    N name; // here "E" means any "Data Type"
    public Birds(M id, N name){
        this.id = id;
        this.name = name;
    }
}
public class GenericsClass {
    public static void main(String args[]){

        //Generic with Single DataType parameter
        Cat<String> c = new Cat<>("JR4A1"); //here we are passing String DataType
        Cat<Integer> c1 = new Cat<>(41); //here we are passing Integer DataType
        System.out.println(c1.getId());

        //Generic with Multiple DataType parameter
        //here we are using String Type for id and Integer Type for Name
        Birds<String, Integer> bds = new Birds<>("4A2", 101);
        //here we are using Integer Type for id and String Type for Name
        Birds<Integer, String> bds1 = new Birds<>(101, "4A2");
    }
}
