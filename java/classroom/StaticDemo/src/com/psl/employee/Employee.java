package com.psl.employee;

public class Employee extends Object {

	static int employeeId;
	int employeeSalary;
	String employeeName;

	public Employee(String name, int salary) {
		// TODO Auto-generated constructor stub

		employeeId++;
		employeeSalary = salary;
		employeeName = name;
	}
	
	static{
		System.out.println("hey1....");
	}

	static{
		System.out.println("hey2....");
	}
	private void displayEmployee() {
		System.out.println("Employee is: " + employeeId + employeeName
				+ employeeSalary);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee is: " + employeeId + employeeName
				+ employeeSalary;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("abc", 2000000);
		e1.displayEmployee();
		Employee e2 = new Employee("xyz", 1600000);
		e2.displayEmployee();
		Employee e3 = new Employee("pqr", 1000000);
		e3.displayEmployee();
		System.out.println(e3);
	}
}
