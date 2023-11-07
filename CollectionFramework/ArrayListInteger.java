// Create an ArrayList of type Integer, add element into it traverse the arraylist and print the elements

package com.prac1;

import java.util.*;

public class ArrayListInteger {
	public static void main(String[] args) {
        // Create an ArrayList of type Integer
        ArrayList<Integer> integerList = new ArrayList<>();

        // Add elements to the ArrayList
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        // Traverse the ArrayList and print the elements
        System.out.println("Elements in the ArrayList:");

        for (Integer element : integerList) {
            System.out.println(element);
        }
    }
}

