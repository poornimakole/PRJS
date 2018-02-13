package com.psl.serialize;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5352892306767532246L;
	int employeeId=107, employeeSalary=2000000;
	String employeeName="abc";
	
	public Employee(int id,int salary,String name) {
		// TODO Auto-generated constructor stub
		employeeId=id;
		employeeSalary=salary;
		employeeName=name;
		
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}

    @Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeSalary="
				+ employeeSalary + ", employeeName=" + employeeName + "]";
	}
/*
	void displayEmployee(){
    	System.out.println("Employee is: " + employeeId + employeeName
				+ employeeSalary);
    }
    
    void showEmp()
    {
    	System.out.println("Employee");
    }*/
}

