package com.psl.demo;

public class Employee  {
	
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

/*
@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	if(this.employeeId>o.employeeId)
		return 1;
	else if(this.employeeId<o.employeeId)
		return -1;
	else 	
		return 0;
}*/

@Override
public int hashCode() {
	return employeeId*31;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (employeeId != other.employeeId)
		return false;
	if (employeeName == null) {
		if (other.employeeName != null)
			return false;
	} else if (!employeeName.equals(other.employeeName))
		return false;
	if (employeeSalary != other.employeeSalary)
		return false;
	return true;
}

}

