package com.psl.vehicles;

public class Employee {
	
	int employeeId=107, employeeSalary=2000000;
	String employeeName="abc";
	
	public Employee() {
		// TODO Auto-generated constructor stub

    	System.out.println("Employee");
		
	}

    void displayEmployee(){
    	System.out.println("Employee is: " + employeeId + employeeName
				+ employeeSalary);
    }
    
    void showEmp()
    {
    	System.out.println("Employee");
    }
}

