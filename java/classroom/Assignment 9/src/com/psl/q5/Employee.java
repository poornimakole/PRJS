package com.psl.q5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Employee implements Comparable<Employee> {

	int employeeId, employeeSalary;
	String employeeName;
	Date employeeJoiningDate;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public Date getEmployeeJoiningDate() {
		return employeeJoiningDate;
	}

	public void setEmployeeJoiningDate(Date employeeJoiningDate) {
		this.employeeJoiningDate = employeeJoiningDate;
	}

	@Override
	public String toString() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",
				Locale.ENGLISH);

		String strd = sdf.format(getEmployeeJoiningDate());
		return employeeId + "  " + employeeName + "  " + employeeSalary + "  "
				+ strd;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		int i = 0;
		if (this.employeeId < o.employeeId)
			i = 1;
		else if (this.employeeId > o.employeeId)
			i = -1;

		return i;
	}

}
