package com.psl.q5;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	 static Set<Employee> eSet =new TreeSet<Employee>();
	 
	 private void displayAllEmployeeInformation() {
			// TODO Auto-generated method stub
		 
		 for (Employee employee : eSet) {
			System.out.println(employee);
		}
			
		}
		
	 private void employeeJoinedBeforeDate(Date d1) {
			// TODO Auto-generated method stub
			Iterator<Employee> itr=eSet.iterator();
			while(itr.hasNext())
			{
				Employee e=itr.next();
				int i=(e.getEmployeeJoiningDate()).compareTo(d1);
				if(i==-1)
				{
					System.out.println(e);
				}
			}
		}
	 
	 private void employeeCompletedSixMonth(Date d) {
			// TODO Auto-generated method stub
		 Iterator<Employee> itr=eSet.iterator();
		 Calendar c=new GregorianCalendar();
			c.setTime(d);
			c.add(Calendar.MONTH, -6);
			Date d2=c.getTime();
			while(itr.hasNext())
			{
				Employee e=itr.next();
				int i=(e.getEmployeeJoiningDate()).compareTo(d2);
				if(i==-1)
				{
					System.out.println(e);
				}
			}
		}
	 
	 private void employeeBasedOnJoiningDate() {
			// TODO Auto-generated method stub
		 TreeSet<Employee> e = new TreeSet<Employee>(new SortByJoiningDate()); 
		 for (Employee employee : eSet) {
				e.add(employee);
			}
		 for (Employee employee : e) {
				System.out.println(employee);
			}
		 
		}
	 
	public static void main(String[] args) {
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
		
		Employee e1=new Employee();
		e1.setEmployeeId(101);
		e1.setEmployeeName("abc");
		e1.setEmployeeSalary(200000);
		try {
			e1.setEmployeeJoiningDate((sdf.parse("23/06/2016")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Employee  e2=new Employee();
		e2.setEmployeeId(102);
		e2.setEmployeeName("xyz");
		e2.setEmployeeSalary(180000);
		try {
			e2.setEmployeeJoiningDate(sdf.parse("13/07/2015"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Employee e5=new Employee();
		e5.setEmployeeId(105);
		e5.setEmployeeName("veda");
		e5.setEmployeeSalary(150000);
		try {
			e5.setEmployeeJoiningDate(sdf.parse("6/12/2016"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Employee e3=new Employee();
		e3.setEmployeeId(107);
		e3.setEmployeeName("vansh");
		e3.setEmployeeSalary(70000);
		try {
			e3.setEmployeeJoiningDate(sdf.parse("4/10/2017"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Employee e4=new Employee();
		e4.setEmployeeId(106);
		e4.setEmployeeName("asmi");
		e4.setEmployeeSalary(180000);
		try {
			e4.setEmployeeJoiningDate(sdf.parse("11/07/2017"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		eSet.add(e1);
		eSet.add(e2);
		eSet.add(e3);
		eSet.add(e4);
		eSet.add(e5);
		
		
		Test t=new Test();
		
		System.out.println("Information of all Employee:");
		t.displayAllEmployeeInformation();
		
		Date d1 = null;
		try {
			d1 = sdf.parse("07/10/2016");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Information of all Employee who joined organization before "+sdf.format(d1));
		t.employeeJoinedBeforeDate(d1);
		
		System.out.println("Information of all Employee who completed 6 month:");
		Date d=new Date();
		t.employeeCompletedSixMonth(d);
		
		System.out.println("Information of student based on joining date:");
		t.employeeBasedOnJoiningDate();
		
		}

		
	}

	

	


