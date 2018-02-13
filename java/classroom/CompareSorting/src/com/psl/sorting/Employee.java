package com.psl.sorting;

public class Employee implements Comparable<Employee> {
	
	int employeeId=107, employeeSalary=2000000;
	String employeeName="abc";
	
	public Employee(int id,int salary,String name) {
		// TODO Auto-generated constructor stub
		employeeId=id;
		employeeSalary=salary;
		employeeName=name;
		
	}

   @Override
public String toString() {
	// TODO Auto-generated method stub
	return "Employee is: " + employeeId + employeeName
			+ employeeSalary;
}

@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	if(this.employeeId>o.employeeId)
		return 1;
	else if(this.employeeId<o.employeeId)
		return -1;
	else 	
		return 0;
}
}

