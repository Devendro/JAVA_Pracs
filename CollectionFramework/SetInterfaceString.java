// Write a Java program using Set interface containing list of items and perform the following operations: a. Add items in the set. b. Insert items of one set in to other set. c. Remove items from the set d. Search the specified item in the set.

package com.prac1;
import java.util.*;

public class SetInterfaceString {
    public static void main(String[] args) {
        // Create two sets
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        // a. Add items to set1
        set1.add("Item1");
        set1.add("Item2");
        set1.add("Item3");

        // Display set1
        System.out.println("Set1: " + set1);

        // b. Insert items of set1 into set2
        set2.addAll(set1);

        // Display set2
        System.out.println("Set2 (after inserting items from set1): " + set2);

        // c. Remove an item from set1
        set1.remove("Item2");

        // Display set1 after removal
        System.out.println("Set1 (after removing 'Item2'): " + set1);

        // d. Search for a specified item in set2
        String searchItem = "Item3";
        if (set2.contains(searchItem)) {
            System.out.println("'" + searchItem + "' found in Set2.");
        } else {
            System.out.println("'" + searchItem + "' not found in Set2.");
        }
    }
}

