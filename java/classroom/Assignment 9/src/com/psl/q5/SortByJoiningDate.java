package com.psl.q5;

import java.util.Comparator;


public class SortByJoiningDate implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		int i=0;
		if(o1.employeeJoiningDate.after(o2.employeeJoiningDate))
		{
			i=-1;
		}
		else if(o1.employeeJoiningDate.before(o2.employeeJoiningDate))
		{
			i=1;
		}
		return i;
	}

}
