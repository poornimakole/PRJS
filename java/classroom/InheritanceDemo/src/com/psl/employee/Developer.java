package com.psl.employee;

public class Developer extends Employee{

	int pf=5000,ta=10000,hra=20000;
	
    public Developer(int id,int salary,String name,int pf,int ta,int hra) {
    	super(id,salary,name);
		// TODO Auto-generated constructor stub
    	this.pf=pf;
    	this.hra=hra;
    	this.ta=ta;
	}
    
   

    @Override
    void displayEmployee() {
    	// TODO Auto-generated method stub
    	super.displayEmployee();
    	
    	int netSalary=employeeSalary+pf+hra+ta;
		
		System.out.println("Devloper is:"+employeeId+netSalary);
    }
	
    void showDev()
    {
    	System.out.println("Developer.");
    }
	/*void displayDeveloper(){
		
		super.displayEmployee();
		int netSalary=employeeSalary+pf+hra+ta;
		
		System.out.println("Devloper is:"+employeeId+netSalary);
	}*/
}
