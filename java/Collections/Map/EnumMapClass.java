package com.java.Collections;
import java.util.EnumMap;

public class EnumMapClass {
        public static void main(String[] args) {
            // Create an EnumMap
            EnumMap<Fruit, Integer> fruitMap = new EnumMap<>(Fruit.class);

            // Put elements in the EnumMap
            fruitMap.put(Fruit.APPLE, 10);
            fruitMap.put(Fruit.BANANA, 5);
            fruitMap.put(Fruit.ORANGE, 8);
            System.out.println("EnumMap: " + fruitMap);

            // Get the value for a key
            int appleCount = fruitMap.get(Fruit.APPLE);
            System.out.println("Apple count: " + appleCount);

            // Check if the EnumMap contains a key
            boolean containsBanana = fruitMap.containsKey(Fruit.BANANA);
            System.out.println("Contains Banana: " + containsBanana);

            // Check if the EnumMap contains a value
            boolean containsValue = fruitMap.containsValue(8);
            System.out.println("Contains value 8: " + containsValue);

            // Get the size of the EnumMap
            int size = fruitMap.size();
            System.out.println("Size: " + size);

            // Create a copy of the EnumMap
            EnumMap<Fruit, Integer> copyMap = new EnumMap<>(fruitMap);
            System.out.println("Copy: " + copyMap);

            // Remove an element from the EnumMap
            int removedValue = fruitMap.remove(Fruit.BANANA);
            System.out.println("Removed value: " + removedValue);
            System.out.println("Updated EnumMap: " + fruitMap);

            // Clear the EnumMap
            fruitMap.clear();
            System.out.println("Cleared EnumMap: " + fruitMap);
        }

        enum Fruit {
            APPLE, BANANA, ORANGE
        }
    }


