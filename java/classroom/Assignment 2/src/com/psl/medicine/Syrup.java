package com.psl.medicine;

public class Syrup extends Medicine {
	public Syrup(String medicineName, String companyAddress) {
		super(medicineName,companyAddress);
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		super.displayLabel();
		System.out.println("Shake well before use....!!");
	}
}
