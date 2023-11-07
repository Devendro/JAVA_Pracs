// Create a class Customer(Account_no Integer, Name Sting), Create a HashMap of type Customer put elements, print elements, check if element with account number 101 is present or not? What is the value for Customer 101.

package com.prac1;

import java.util.*;

class Customer {
    private int accountNo;
    private String name;

    public Customer(int accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }
}


public class MapInterfaceCustomer {
	public static void main(String[] args) {
        // Create a HashMap to store Customer objects
        HashMap<Integer, Customer> customerMap = new HashMap<>();

        // Create and add customers to the HashMap
        Customer customer1 = new Customer(101, "John Doe");
        Customer customer2 = new Customer(102, "Jane Smith");
        Customer customer3 = new Customer(103, "Alice Johnson");

        customerMap.put(customer1.getAccountNo(), customer1);
        customerMap.put(customer2.getAccountNo(), customer2);
        customerMap.put(customer3.getAccountNo(), customer3);

        // Print all elements in the HashMap
        for (Customer customer : customerMap.values()) {
            System.out.println("Account Number: " + customer.getAccountNo() + ", Name: " + customer.getName());
        }

        // Check if an element with account number 101 is present
        int accountNumberToCheck = 101;
        if (customerMap.containsKey(accountNumberToCheck)) {
            Customer customer101 = customerMap.get(accountNumberToCheck);
            System.out.println("Customer with Account Number 101 found. Name: " + customer101.getName());
        } else {
            System.out.println("Customer with Account Number 101 not found.");
        }
    }
}

