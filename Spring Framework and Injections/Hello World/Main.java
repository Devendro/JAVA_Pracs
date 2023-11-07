// src/main/java/<package>
// run main.java

package com.springHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	      Hello obj = (Hello) context.getBean("helloWorld");
	      obj.getMessage();
	   }
}
