/**
 *  Java program to demonstrate java doc HashSet implementation.
 */

package com.myhashset;

import java.util.HashMap;
import java.util.Objects;

/**
 *  MyHashSet class.
 */
public class MyHashSet {

    // Dummy value to associate with an Object in Map.
    private static final Object PRESENT = new Object();
    // Map to store values.
    HashMap map;

    // Constructor of MyHashSet class.
    public MyHashSet() {
        map = new HashMap();
    }

    // Second constructor of MyHashSet class.
    public MyHashSet(int initialCapacity) {
        map = new HashMap(initialCapacity);
    }

    // Method add().
    public <E> boolean add(E e) {

        return map.put(e, PRESENT) == null;

    }

    // Method remove().
    public boolean remove(Object obj) {

        return map.remove(obj) == PRESENT;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyHashSet myHashSet = (MyHashSet) o;
        return Objects.equals(map, myHashSet.map);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(map);
    }

    @Override
    public String toString() {
        return "MyHashSet " + map.keySet();
    }

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating instance of MyHashSet.
        MyHashSet myHashSet = new MyHashSet(3);

        // Adding elements to myHashSet.
        myHashSet.add(2);
        myHashSet.add(4.8);
        myHashSet.add(7);

        // Printing elements of myHashSet to console.
        System.out.println(myHashSet);

    }
}