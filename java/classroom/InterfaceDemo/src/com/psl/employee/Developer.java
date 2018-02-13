package com.psl.employee;

import com.psl.demo.AmirKhan;
import com.psl.demo.Printable;

public class Developer implements Printable,AmirKhan {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Developer");
	}

	@Override
	public void acting() {
		// TODO Auto-generated method stub
		System.out.println("Developer Amir");
	}

}
