package com.persistent.app;

public class Greeter {
	String greeterName;

	public Greeter(String name) {
		// TODO Auto-generated constructor stub
		greeterName = name;
	}

	public String sayHello() {
		String result = "Hello  " + greeterName;

		return result;
	}

	public void sayGoodBye() {
		System.out.println("GoodBye "+greeterName);
	}

}
