// Create an employee class (id, name, salary) create an Arraylist of type employee, add 5 employee, traverse the ArrayList and print the elements, Remove one element and print the list

package com.prac1;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and setters for name and salary (omitted for brevity)

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

public class ArrayListEmployee {
    public static void main(String[] args) {
    // Create an ArrayList of type Employee
    ArrayList<Employee> employeeList = new ArrayList<>();

    // Add 5 employees to the ArrayList
    employeeList.add(new Employee(1, "John", 50000.0));
    employeeList.add(new Employee(2, "Jane", 55000.0));
    employeeList.add(new Employee(3, "Bob", 60000.0));
    employeeList.add(new Employee(4, "Alice", 52000.0));
    employeeList.add(new Employee(5, "Eva", 58000.0));

    // Traverse the ArrayList and print the elements
    System.out.println("Employees in the ArrayList:");
    for (Employee employee : employeeList) {
        System.out.println(employee);
    }

    // Remove one employee (for example, the employee with id 3)
    int employeeIdToRemove = 3;
    for (int i = 0; i < employeeList.size(); i++) {
        if (employeeList.get(i).getId() == employeeIdToRemove) {
            employeeList.remove(i);
            break; // Exit the loop after removal
        }
    }

    // Print the updated ArrayList after removal
    System.out.println("\nEmployees in the ArrayList after removal:");
    for (Employee employee : employeeList) {
        System.out.println(employee);
    }
}
}

