package com.Prac7;

//src/main/java/<package>
//run main.java

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Deposit deposit = (Deposit) context.getBean("deposit");
		Withdraw withdraw = (Withdraw) context.getBean("withdraw");
		Beneficiary beneficiary = (Beneficiary) context.getBean("beneficiary");
		deposit.payment();
		withdraw.drawout();
		beneficiary.addBeneficiary();
	}
}
