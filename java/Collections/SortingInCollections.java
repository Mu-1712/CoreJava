package com.java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Example to sort user-defined class objects
class Student implements Comparable<Student> {
    public String name;
    public boolean age;

    public Student(String name) {
        this.name = name;
    }
    public int compareTo(Student person) {
        return name.compareTo(person.name);
    }
}

public class SortingInCollections {
    public static void main(String args[]){

        ArrayList<String> al=new ArrayList<String>();
        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");

        System.out.println("Sorting using Collections");
        Collections.sort(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //Sorting in Reverse order using Collections
        System.out.println("Sorting in Reverse order using Collections");
        Collections.sort(al,Collections.reverseOrder());
        Iterator itr1=al.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        //Example to sort Wrapper class objects
        System.out.println("Example to sort Wrapper class objects");
        ArrayList num =new ArrayList();
        num.add(Integer.valueOf(103));
        num.add(Integer.valueOf(101));
        num.add(Integer.valueOf(104));
        num.add(Integer.valueOf(102));

        Collections.sort(num);
        Iterator itrnum = num.iterator();
        while (itrnum.hasNext()){
            System.out.println(itrnum.next());
        }

        //Example to sort user-defined class objects
        System.out.println("Example to sort user-defined class objects");
        ArrayList<Student> al1=new ArrayList<Student>();
        al1.add(new Student("Viru"));
        al1.add(new Student("Saurav"));
        al1.add(new Student("Mukesh"));
        al1.add(new Student("Tahir"));

        Collections.sort(al);
        for (Student s : al1) {
            System.out.println(s.name);
        }
    }
}
