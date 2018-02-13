package com.psl.dao;

import java.util.List;

import com.psl.beans.Employee;


public interface IEmpDAO {

	void createEmployee(Employee e);
	List<Employee> getAllEmployee();
	void updateEmployee(int id,String name);
	void deleteEmployee(Employee e);
}
