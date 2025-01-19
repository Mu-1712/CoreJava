package com.programs;

class Obj {
    private int value;

    public Obj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Obj other = (Obj) obj;
        return value == other.value;
    }
}

class Obj2 {
    private double value;

    public Obj2(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Obj2 other = (Obj2) obj;
        return Double.compare(other.value, value) == 0;
    }
}

public class ObjectCompare {
    public static void main(String[] args) {
        Obj x = new Obj(123);
        Obj2 y = new Obj2(123.23123);
        System.out.println("Objects are not equal, hence it returns " + x.equals(y));
        System.out.println("Objects are equal, hence it returns " + x.equals(new Obj(123)));
    }
}
