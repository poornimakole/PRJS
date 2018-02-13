package com.psl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.beans.Employee;
import com.psl.dao.IEmpDAO;

@Service
public class EmployeeService {
	
	@Autowired
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
