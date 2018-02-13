package com.psl.q4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Client {
	
	private Employee inputData(Scanner sc) throws CustomException {
		// TODO Auto-generated method stub
	    Employee e=new Employee();
	    	    
	    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
		System.out.println("Enter Employee Name");
		 String name=sc.next();
		 if(name==null)
		 {
			 throw new CustomException("name cannot be empty.....");
		 }
		  e.setName(name);
		 System.out.println("Enter Employee Address");
		 String add=sc.next();
		 if(add==null)
		 {
			 throw new CustomException("Address is mandatory.....");
		 }
		 e.setAddress(add);
		 System.out.println("Enter Employee Date of birth(dd/mm/yyyy)");
		 String date=sc.next();
		  try {
			e.setDateOfBirth(sdf.parse(date));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		if(id<=0)
		{
			throw new CustomException("Employee id cannot be zero or negative ");
		}
		e.setId(id);
		System.out.println("Enter Employee Salary");
		int sal=sc.nextInt();
		if(sal<=0)
		{
			throw new CustomException("Employee salary cannot be zero or negative ");
		}
		e.setEmployeeSalary(sal);
		System.out.println(e);
		return e;
	}
	
	private void writeData(Employee emp) {
		// TODO Auto-generated method stub
        File f=new File("Employee.ser");
		if(f.exists()){
			System.out.println("File Exists.......!!!");
		}
		else
		{
			System.out.println("File doesn't exists....!!!");
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		try (
			FileOutputStream  fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);)
			{
				oos.writeObject(emp);
				System.out.println("done");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	private void readData() {
		// TODO Auto-generated method stub
			File f=new File("Employee.ser");
		
		if(f.exists()){
			System.out.println("File Exists.......!!!");
		}
		else
		{
			System.out.println("File doesn't exists....!!!");
		}
		
		try(
		     FileInputStream fis=new FileInputStream(f);
			ObjectInputStream ois=new ObjectInputStream(fis);)
			{
			Employee e1=new Employee() ;
			while(fis.available()>0){
				e1=(Employee) ois.readObject();
				System.out.println(e1.getId()+"  "+e1.getName()+"  "+e1.getAddress()+"  "+e1.getDateOfBirth()+"  "+e1.getEmployeeSalary());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	public static void main(String[] args) 
	{
		Client c=new Client();
		Scanner sc=new Scanner(System.in);
		
		 try {
			Employee e1= c.inputData(sc);
			c.writeData(e1);
			c.readData();
			sc.close();
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	

	
}
