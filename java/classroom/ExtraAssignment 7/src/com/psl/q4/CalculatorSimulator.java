package com.psl.q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorSimulator {

	public static void main(String[] args) {
		TaxCalculator tc=new TaxCalculator();
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter employee name:");
		
		try {
			String empName = br.readLine();
			System.out.println("Enter whether employee is Indian(true/false):");
			boolean isIndian=Boolean.parseBoolean(br.readLine());
			System.out.println("Enter employee salary:");
			double empSal=Double.parseDouble(br.readLine());
			 
			double result=tc.calculateTax(empName, isIndian, empSal);
			System.out.println("Tax amount is "+result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CountryNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmployeeNameInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TaxNotEligibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
