package com.psl.q5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	
	public static void main(String[] args) {
		
		EmpManagement e=new EmpManagement();
				
		  e.addEmp(12, "pooja","margao","675858", 20000);
		  e.addEmp(7, "nidhi","bicholim","436336", 30000);
		  e.addEmp(5, "asmi","mapusa","252455", 25400);
		  e.addEmp(2, "vada","mapusa","675743", 23500);
		  e.addEmp(10, "vansh","morjim","2345542", 40000);
		  
		  e.displayAll();
		  
		  System.out.println("Enter employee id:");
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  try {
			e.searchEmp(Integer.parseInt(br.readLine()));
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
