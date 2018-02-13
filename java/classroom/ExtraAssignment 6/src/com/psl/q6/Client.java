package com.psl.q6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

public class Client {
	
	public static void main(String[] args) {
		List<Employee> eList=new ArrayList<Employee>();
		Employee e=null;
		DOB d=null;
		int option=0; 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("......MENU.......");
			System.out.println("1. Add Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. Work Experience");
			System.out.println("4. Gratuity Eligibility");
			System.out.println("5. Sort By Experience");
			System.out.println("6. Exit");
			System.out.println("Select option:");
			try {
				option=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			switch(option)
			{
			case 1:
				
				try {
					e=new Employee();
					d=new DOB();
					System.out.print("Enter Employee ID: ");
					e.setEmployee_ID(Integer.parseInt(br.readLine()));
					
					System.out.println("Enter Employee Name: ");
					e.setEmployee_Name(br.readLine());
					
					System.out.println("Enter Employee Telephone: ");
					e.setEmployee_Telephone(Long.parseLong(br.readLine()));
					
					SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
					System.out.println("Enter Employee joining date(dd/mm/yyyy)");
					e.setEmployee_DOJ(sdf.parse(br.readLine()));
					
					System.out.println("Enter date of birth(dd/mmm/yyyy):");
					StringTokenizer st=new StringTokenizer(br.readLine(),"/");
					d.setDay(Integer.parseInt(st.nextToken()));
					d.setMonth(st.nextToken().toUpperCase());
					d.setYear(Integer.parseInt(st.nextToken()));
					e.setDob(d);
					eList.add(e);
					
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
				break;
			case 2:
				
				System.out.print("Enter Month name(mmm): ");
				String m=null;
					try {
						boolean flag=false;
						m=br.readLine();
						Iterator<Employee> itr=eList.iterator();
						while(itr.hasNext())
						{
							Employee emp=itr.next();
							if(emp.getDob().getMonth().equals(m.toUpperCase()))
							{
								System.out.println(emp);
								flag=true;
							}
						}
						if(!flag)
						{
							System.out.println("No Record Found...!!!");
						}
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				break;
			case 3:
				
				int id=0;
				try {
					System.out.print("Enter Employee ID: ");
					id=Integer.parseInt(br.readLine());
					boolean flag=false;
					Iterator<Employee> itr=eList.iterator();
					while(itr.hasNext())
					{
						Employee emp=itr.next();
						if(emp.getEmployee_ID()==id)
						{
							Calendar cal = Calendar.getInstance();
							cal.setTime(emp.getEmployee_DOJ());
							LocalDate date1 = LocalDate.of(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
							Date d1=new Date();
						    cal = Calendar.getInstance();
							cal.setTime(d1);
							LocalDate date2 = LocalDate.of(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
							Period p=Period.between(date1, date2);
							int yy=p.getYears();
							int mm=p.getMonths();
							System.out.println(emp.getEmployee_ID()+"  "+emp.getEmployee_Name()+" has Work experience of "+yy+" years"+mm+" months");
							flag=true;
							break;
						}
						
					}
					if(!flag)
					{
						System.out.println("No Record Found...!!!");
					}
					
					
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 4:
				try {
					boolean flag=false;
					
					Date d1=new Date();
				    Calendar cal1 = Calendar.getInstance();
					cal1.setTime(d1);
					LocalDate date2 = LocalDate.of(cal1.get(Calendar.YEAR),cal1.get(Calendar.MONTH) + 1, cal1.get(Calendar.DAY_OF_MONTH));
					
					Iterator<Employee> itr=eList.iterator();
					while(itr.hasNext())
					{
						Employee emp=itr.next();
							Calendar cal = Calendar.getInstance();
							cal.setTime(emp.getEmployee_DOJ());
							LocalDate date1 = LocalDate.of(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
							
							Period p=Period.between(date1, date2);
							int yy=p.getYears();
							if(yy>=5)
							{
								System.out.println(emp);
								flag=true;
							}		
					}
					if(!flag)
					{
						System.out.println("No Record Found...!!!");
					}
					
					
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				break;
			case 5:
				   Collections.sort(eList,new Comparator<Employee>() {

					@Override
					public int compare(Employee e1, Employee e2) {
						// TODO Auto-generated method stub
						int i=0;
						if(e1.getEmployee_DOJ().before(e2.getEmployee_DOJ()))
							i=-1;
						else if(e1.getEmployee_DOJ().after(e2.getEmployee_DOJ()))
						  i=1;
						return i;
					}
					   
				});
				   System.out.println("\n Details of employee after sort by experience");
				   for (Employee employee : eList) {
					System.out.println(employee);
				}
				break;
			case 6:
				System.exit(0);
				default:
					System.out.println("Invalid option...!!!");
			}
			
		}while(option !=6);
	}

}
