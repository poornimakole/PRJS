package com.psl.q1;

import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {
	
	Employee e=new Employee();
	e.setEmployeeId(102);
	e.setEmployeeName("abc");
	e.setEmployeeSalary(200000);
	
	Vehicle v=new Vehicle();
	  v.setVehicleNo("v-101");
	  v.setVehicleName("audi");
	  
	  Vehicle v1=new Vehicle();
	  v1.setVehicleNo("v-102");
	  v1.setVehicleName("nano");
	  
	  Vehicle v2=new Vehicle();
	  v2.setVehicleNo("v-103");
	  v2.setVehicleName("alto");
	  
	  List<Vehicle> vList=new ArrayList<Vehicle>();
	    vList.add(v);
	    vList.add(v1);
	    vList.add(v2);
	    e.setvList(vList);
	    System.out.println(e);
	  
	
	    Employee e1=new Employee();
		e1.setEmployeeId(101);
		e1.setEmployeeName("xyz");
		e1.setEmployeeSalary(300000);
		
		Vehicle v3=new Vehicle();
		  v3.setVehicleNo("v-105");
		  v3.setVehicleName("audi");
		  
		  Vehicle v4=new Vehicle();
		  v4.setVehicleNo("v-109");
		  v4.setVehicleName("nano");
		 
		  
		  List<Vehicle> v1List=new ArrayList<Vehicle>();
		    v1List.add(v3);
		    v1List.add(v4);
		    e1.setvList(v1List);
		    System.out.println(e1);
	
}
}
