package com.psl.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;
import com.psl.service.EmployeeService;

public class Client {
	public static void main(String[] args) {
		

		ApplicationContext context=new ClassPathXmlApplicationContext("Db.xml");
		
		EmployeeService s =context.getBean("service",EmployeeService.class);
		Employee e =context.getBean("emp",Employee.class);
		
		//s.createEmployee(e);
		List<Employee> eList=s.getAllEmployee();
		
		for (Employee employee : eList) {
			System.out.println(employee);
		}
		

		System.out.println("done!");
		
	}
	
	
	
}
