package com.psl.q6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Employee {
	int employee_ID;
	String employee_Name;
	long employee_Telephone;
	Date employee_DOJ;
	DOB dob;

	public int getEmployee_ID() {
		return employee_ID;
	}

	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}

	public String getEmployee_Name() {
		return employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}

	public long getEmployee_Telephone() {
		return employee_Telephone;
	}

	public void setEmployee_Telephone(long employee_Telephone) {
		this.employee_Telephone = employee_Telephone;
	}

	public Date getEmployee_DOJ() {
		return employee_DOJ;
	}

	public void setEmployee_DOJ(Date employee_DOJ) {
		this.employee_DOJ = employee_DOJ;
	}

	public DOB getDob() {
		return dob;
	}

	public void setDob(DOB dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
		return "Employee :" + employee_ID + " " + employee_Name + " "
				+ employee_Telephone + " " + sdf.format(employee_DOJ)+ " " + dob.getDay()
				+ " " + dob.getMonth() + " " + dob.getYear();
	}

}
