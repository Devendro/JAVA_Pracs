package com.Prac7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Multiplier multiplier = (Multiplier) context.getBean("Multiplier");
		int result = multiplier.multiply(5, 3);
		System.out.println("Product is " + result);
	}
}
