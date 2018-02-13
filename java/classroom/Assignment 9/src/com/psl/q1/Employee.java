package com.psl.q1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	int employeeId, employeeSalary;
	String employeeName;
	List<Vehicle> vList=new ArrayList<Vehicle>();

   public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public List<Vehicle> getvList() {
		return vList;
	}


	public void setvList(List<Vehicle> vList) {
		this.vList = vList;
	}


	public int getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


@Override
public String toString() {
	return "Employee :" + employeeId + "  "	+ employeeSalary + "  " + employeeName + "\nHe has vehicles:"
			+ vList;
}
   
}

