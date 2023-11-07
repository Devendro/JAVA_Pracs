// src/main/java/<package>
// run main.java

package com.springHello;

public class Hello {
	private String message;
	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println(message);
	}
}
