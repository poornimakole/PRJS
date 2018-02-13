package com.psl.employee;

public class Employee {
	
	int employeeId=107, employeeSalary=2000000;
	String employeeName="abc";
	
	public Employee(int id,int salary,String name) {
		// TODO Auto-generated constructor stub
		employeeId=id;
		employeeSalary=salary;
		employeeName=name;
		
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

