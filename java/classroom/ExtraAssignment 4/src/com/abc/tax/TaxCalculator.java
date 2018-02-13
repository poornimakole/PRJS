package com.abc.tax;

public class TaxCalculator {
	float basicSalary,nettSalary,tax;
	boolean citizenship  ;
	public TaxCalculator(float basicSalary,boolean citizenship) {
		// TODO Auto-generated constructor stub
		this.basicSalary=basicSalary;
		this.citizenship=citizenship;
	}
	public void calculateTax()
	{
		float tax=(30*basicSalary)/100;
		System.out.println("The Tax is  "+tax+" for the "+basicSalary+".");
		this.tax=tax;
	}
	public void deductTax()
	{
		nettSalary=basicSalary-tax;
		System.out.println("The nettSalary is  "+nettSalary+".");
	}
	public void validateSalary()
	{
		if(basicSalary>100000 && citizenship==true)
		System.out.println("The Salary and citizenship eligibility criteria is satisfied.");
	}
	
	public static void main(String[] args) {
		TaxCalculator tc=new TaxCalculator(400000,true);
		tc.calculateTax();
		tc.deductTax();
		tc.validateSalary();
	}

}
