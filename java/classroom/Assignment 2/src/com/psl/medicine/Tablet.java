package com.psl.medicine;

public class Tablet extends Medicine{
	public Tablet(String medicineName, String companyAddress) {
		super(medicineName,companyAddress);
		// TODO Auto-generated constructor stub
	}
	
@Override
void displayLabel() {
	// TODO Auto-generated method stub
	super.displayLabel();
	System.out.println("Store in cold dry place....!!");
}

	
}
