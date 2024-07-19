package com.java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students { // Changed from Students to Student
    int rollno;
    String name;
    int age;

    public Students(int rollno, String name, int age) { // Constructor
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Students> { // Corrected generic type

    @Override
    public int compare(Students s1, Students s2) {
        return Integer.compare(s1.age, s2.age); // Simplified comparison
    }
}

class NameComparator implements Comparator<Students> { // Corrected generic type

    @Override
    public int compare(Students s1, Students s2) {
        return s1.name.compareTo(s2.name); // Compare names
    }
}

public class ComparatorInterface { // Corrected class name
    public static void main(String args[]) {

        ArrayList<Students> al = new ArrayList<Students>();
        al.add(new Students(101, "Vijay", 23)); // Corrected parameter order
        al.add(new Students(106, "Ajay", 27));
        al.add(new Students(108, "Jai", 21));

        System.out.println("Sorting by Name");
        Collections.sort(al, new NameComparator());
        for (Students st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        System.out.println("Sorting by Age");
        Collections.sort(al, new AgeComparator());
        for (Students st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
