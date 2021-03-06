package com.psl.q4;

import java.io.Serializable;

public class Employee extends Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int Id;
	int employeeSalary;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", employeeSalary=" + employeeSalary
				+ ", Name=" + Name + ", Address=" + Address + ", DateOfBirth="
				+ DateOfBirth + "]";
	}
	
	

}
