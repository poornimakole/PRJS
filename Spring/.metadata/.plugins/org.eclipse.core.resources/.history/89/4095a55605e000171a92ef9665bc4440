package com.psl.service;

import java.util.List;

import com.psl.bean.Employee;
import com.psl.dao.IEmpDAO;

public class EmployeeService {
	
	private IEmpDAO dao;
	
	

	 public IEmpDAO getDao() {
		return dao;
	}



	public void setDao(IEmpDAO dao) {
		this.dao = dao;
	}



	public void createEmployee(Employee e)
	 {
		 dao.createEmployee(e);
		 // dao.updateEmployee(e.getId(),"veda");
		  //dao.deleteEmployee(e);
	 }
	public List<Employee> getAllEmployee()
	{
		return dao.getAllEmployee();
		
	}
}
