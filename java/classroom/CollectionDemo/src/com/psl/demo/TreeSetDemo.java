package com.psl.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
	//	Set<String> obj = new TreeSet<String>();
		Set<Employee> obj = new HashSet<Employee>();
		
		Employee e1= new Employee(102, 60000, "abc");
		Employee e2= new Employee(101,40000, "xyz");
		Employee e3= new Employee(103,20000, "pqr");
		Employee e4= new Employee(101,40000, "xyz");
		
		
		obj.add(e1);
		obj.add(e2);
		obj.add(e3);
		obj.add(e4);
		
		System.out.println(obj);
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e4));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		
		
	}
	

}
