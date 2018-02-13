package com.psl.sorting;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		int i=0;
		if(e1.employeeSalary>e2.employeeSalary){
			i=1;
		}else if(e1.employeeSalary<e2.employeeSalary){
			i=-1;
		}
		
		return i;
	}

}
