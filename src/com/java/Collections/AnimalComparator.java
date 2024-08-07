package com.java;

public class AnimalComparator implements Comparable<AnimalComparator>{
    public String name;
    int age;
    public int weight;

    public AnimalComparator(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "AnimalComparator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}' + '\n';
    }

    @Override
    public int compareTo(AnimalComparator that) {
        return this.age - that.age;
    }
    public static void main(String[] args){

    }
}
