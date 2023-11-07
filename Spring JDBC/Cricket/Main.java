// src/main/java/<package>
// run main.java

package com.springHello;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketerTemplate cricketerTemplate = (CricketerTemplate) context.getBean("cricketerTemplate");
        System.out.println("inserting 5 records");
        cricketerTemplate.insert("Aiden", 50, 100);
        cricketerTemplate.insert("Olivia", 45, 100);
        cricketerTemplate.insert("Elijah", 70, 110);
        cricketerTemplate.insert("Sophia", 30, 200);
        cricketerTemplate.insert("Logan", 60, 80);
        System.out.println("Listing Records...");
        List<cricketer> cricketers = cricketerTemplate.listCricketers();
        for (cricketer record : cricketers) {
            System.out.print("Name : " + record.getName());
            System.out.print(", Runs : " + record.getRuns());
            System.out.println(", Best score : " + record.getBestRuns());
        }
    }
}
