package com.Prac7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			voter voter1 = (voter) context.getBean("voter");
			voter1.setName("Prasad");
			voter1.setAge(16);

		} catch (Exception e) {
			// Exception is handled by the aspect
		}
	}
}
