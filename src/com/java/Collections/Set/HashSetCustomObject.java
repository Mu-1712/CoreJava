package com.java.Collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class HashsetCustom{
    int rollno;
    String name;

    public HashsetCustom(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    //to implement Custom Hashset, equals and hashcode methods are must
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashsetCustom that = (HashsetCustom) o;
        return rollno == that.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollno);
    }

    @Override
    public String toString() {
        return "HashsetCustom{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}

public class HashSetCustomObject {
    public  static void main(String[] args){

        Set<HashsetCustom> set = new HashSet<>();

        HashsetCustom hc = new HashsetCustom(101, "Tanjiro");
        HashsetCustom hc2 = new HashsetCustom(101, "Zenitsu");
        System.out.println(hc.equals(hc2));

        //here only one name inserted which is Tnajiro, others can cant
        // be inserted bcuz thier rollno are same as Tanjoo, to be inserted they sould have unique rollno
        set.add(new HashsetCustom(101, "Tanjiro"));
        set.add(new HashsetCustom(101, "Zenitsu"));
        set.add(new HashsetCustom(101, "Muzan"));
        System.out.println(set);

        //here all are inserted into hashSet only one name inserted,
        //  bcuz each one is havinge unique rollno
        set.add(new HashsetCustom(101, "Tanjiro"));
        set.add(new HashsetCustom(102, "Zenitsu"));
        set.add(new HashsetCustom(103, "Muzan"));
        System.out.println(set);
    }
}
