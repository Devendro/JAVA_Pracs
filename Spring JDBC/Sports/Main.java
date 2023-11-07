// src/main/java/<package>
// run main.java

package com.springHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SportsTemplate temp = (SportsTemplate) context.getBean("sportsTemplate");
        System.out.println("Inserting Records...");
        temp.insert("football", "outdoor", 12);
        temp.insert("cricket", "outdoor", 11);
        temp.insert("chess", "indoor", 2);
        System.out.println("Deleting Record...");
        temp.delete("chess");
    }
}
