package com.springHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the Student bean
        Student student = (Student) context.getBean("student");

        // Print the details of the Student and its associated Address
        System.out.println(student);
    }
}

