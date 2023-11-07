// src/main/java/<package>
// run main.java

package com.springHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the Rectangle bean
        Rectangle rectangle = (Rectangle) context.getBean("rectangle");

        // Print the details of the Rectangle
        System.out.println(rectangle);
    }
}

