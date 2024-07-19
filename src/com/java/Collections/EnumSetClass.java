package com.java.Collections;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumSetClass {
    public static void main(String[] args){

        Set<days> set1 = EnumSet.of(days.SUNDAY, days.FRIDAY);
        Iterator itr = set1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        Set<days> set2 = EnumSet.allOf(days.class);
        System.out.println("Weekdays: " +set2);

        Set<days> set3 = EnumSet.noneOf(days.class);
        System.out.println("Weekdays: " +set3);

        Set<days> set4 = EnumSet.copyOf(EnumSet.allOf(days.class));
        System.out.println("CopyOf Weekdays: " +set4);

        Set<days> set5 = ((EnumSet<days>) set1).clone(); //clone has protected accessin javaobj so enumset should be in brackets
        System.out.println("Cloned set: " +set5);

    }
}
