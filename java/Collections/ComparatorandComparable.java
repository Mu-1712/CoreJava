package com.java.Collections;

import com.java.AnimalComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CustomanimalComparator implements Comparator<AnimalComparator>{

    @Override
    public int compare(AnimalComparator o1, AnimalComparator o2) {
        return Integer.compare(o1.weight, o2.weight); //Recommended
        //return o1.weight - o2.weight; // not Recommended
    }
}
public class ComparatorandComparable { // Corrected class name
    public static void main(String args[]) {

        AnimalComparator ac = new AnimalComparator("Cat", 3, 10);
        AnimalComparator ac2 = new AnimalComparator("Snake", 6, 20);
        AnimalComparator ac3 = new AnimalComparator("Kitten", 2, 15);
        AnimalComparator ac4 = new AnimalComparator("Fish", 7, 5);

        List<AnimalComparator> animals = new ArrayList<>();
        animals.add(ac); // Corrected parameter order
        animals.add(ac2);
        animals.add(ac3);
        animals.add(ac4);
        animals.add(new AnimalComparator("Horse", 7, 100));


//        System.out.println("Sorting by Name");
//        Collections.sort(al, new NameComparator());
//        for (Animals st : al) {
////            System.out.println(st.rollno + " " + st.name + " " + st.age);
////        }

        //Sorting by Age
        System.out.println("Sorting by Age");
        Collections.sort(animals);
        System.out.println(animals);

        //Sorting by Weight
        System.out.println("Sorting by Weight");
        Collections.sort(animals, new CustomanimalComparator());
        System.out.println(animals);


        //Sorting by Name
        System.out.println("Sorting by Name using Comparator");
        Collections.sort(animals, new Comparator<AnimalComparator>() {
            @Override
            public int compare(AnimalComparator o1, AnimalComparator o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(animals);

        //This below method is same as above comaprator,
        // just using comparing method of collections
        System.out.println("Sorting by Name using Comparator.Comapring()");
        Collections.sort(animals, Comparator.comparing(AnimalComparator::getAge));
        System.out.println(animals);

        //This below method is same as above comaprator,
        // just using comparing method of collections, frst it sort by age and then with name
        System.out.println("Sorting First by age and then with Name using Comparator.Comapring()");
        Collections.sort(animals, Comparator.comparing(AnimalComparator::getAge).thenComparing(AnimalComparator::getName));
        System.out.println(animals);

        System.out.println("Sorting by Name Using LamdaExpressions");
        Collections.sort(animals, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(animals);
    }
}
