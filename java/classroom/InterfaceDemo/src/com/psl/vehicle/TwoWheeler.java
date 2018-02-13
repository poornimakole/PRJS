package com.psl.vehicle;

import com.psl.demo.AmirKhan;
import com.psl.demo.Printable;

public class TwoWheeler implements Printable,AmirKhan {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Two Wheeler");
	}
	@Override
	public void acting() {
		// TODO Auto-generated method stub
		System.out.println("Amir bought Two Wheeler");
		
	}
}
