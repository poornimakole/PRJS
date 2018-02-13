package com.app.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Address;
import com.app.model.Employee;


public class Client {
	
	public static void main(String[] args) {
		
		List<Employee> eList=populateEmployee();
		SessionFactory sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    
		Session session=sessionfactory.openSession();
		session.beginTransaction();
          
		
      for (Employee employee : eList) {
    	  session.save(employee);
		}
		
		Employee emp=(Employee) session.get(Employee.class,3);
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();

		System.out.println("***********************************");
		System.out.println(emp.getName()+"   "+emp.getSkills());
	}

	private static List<Employee> populateEmployee() {
		// TODO Auto-generated method stub
		List<Employee> eList= new ArrayList<Employee>();
		
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setName("veda");
		emp1.setAddr(new Address(23,"mapusa","goa",490802));
		emp1.setHome_addr(new Address(23,"mapusa","goa",490802));
		emp1.setSkills("java,spring");
		
		Employee emp2=new Employee();
		emp2.setId(2);
		emp2.setName("vansh");
		emp2.setAddr(new Address(23,"morjim","goa",403512));
		emp2.setHome_addr(new Address(23,"morjim","goa",403512));
		emp2.setSkills("java,hibernate");
		
		Employee emp3=new Employee();
		emp3.setId(3);
		emp3.setName("asmi");
		emp3.setAddr(new Address(45,"mapusa","goa",490802));
		emp3.setHome_addr(new Address(45,"mapusa","goa",490802));
		emp3.setSkills("java,spring,hibernate");
		
		eList.add(emp1);
		eList.add(emp2);
        eList.add(emp3);
		
		return eList;
	}

}