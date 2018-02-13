package com.psl.medicine;

public class Ointment extends Medicine{
public Ointment(String medicineName, String companyAddress) {
	super(medicineName,companyAddress);
	// TODO Auto-generated constructor stub
}

@Override
void displayLabel() {
	// TODO Auto-generated method stub
	super.displayLabel();
	System.out.println("For external use only....!!");
}
}
