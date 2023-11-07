// Create a LinkedList of type String add 5 elements and traverse the list and from both sides

package com.prac1;
import java.util.*;

public class LinkedListString {
	public static void main(String[] args) {
        // Create a LinkedList of type String
        LinkedList<String> stringList = new LinkedList<>();

        // Add elements to the LinkedList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Fig");
        // Traverse the LinkedList from the beginning
        System.out.println("Elements in the LinkedList (from the beginning):");
        for (String element : stringList) {
            System.out.println(element);
        }

        // Traverse the LinkedList from the end
        System.out.println("\nElements in the LinkedList (from the end):");
        for (int i = stringList.size() - 1; i >= 0; i--) {
            System.out.println(stringList.get(i));
        }
    }
}
