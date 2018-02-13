package com.psl.employee;

public class Client {
	public static void main(String[] args) {
		/*Employee e = new Employee();
		e.displayEmployee();*/
		Employee d = new Developer(101,700000,"abc",5000,10000,13000);
	
		 d.displayEmployee();
		//d.displayDeveloper();
	}

}
