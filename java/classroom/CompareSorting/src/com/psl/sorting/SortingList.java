package com.psl.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingList {
	public static void main(String[] args) {
		Employee e1= new Employee(102, 60000, "abc");
		Employee e2= new Employee(101,40000, "xyz");
		Employee e3= new Employee(103,20000, "pqr");
		
		List<Employee> list=new ArrayList<Employee>();
		//Set<Employee> list=new TreeSet<Employee>();
	
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list);
		System.out.println("Before sorting:" +list);
		
		Collections.sort(list);
		
		System.out.println("After sorting:" +list);
		
		Collections.sort(list,new Comparator<Employee>() {
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
		});
		
		System.out.println("After sorting:" +list);
		
		Collections.sort(list,new Comparator<Employee>() {
			 @Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub

					return o1.employeeName.compareTo(o2.employeeName);
			}
		});
		
		System.out.println("After sorting:" +list);
		
		
		
		
		
	}

}
