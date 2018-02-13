package com.psl.demo;

import com.psl.employee.Developer;
import com.psl.vehicle.TwoWheeler;

public class Client {

	public static void main(String[] args) {
		
		Printable p=new Developer(); 
		AmirKhan a=new Developer(); 
		p.print();
		a.acting();
		p=new TwoWheeler();
		a=new TwoWheeler();
		p.print();
		a.acting();
	}
}
