package com.psl.medicine;

public class Medicine {
	String medicineName, companyAddress;

	public Medicine(String medicineName, String companyAdress) {
		// TODO Auto-generated constructor stub
		this.medicineName = medicineName;
		this.companyAddress = companyAdress;
	}

	void displayLabel() {
		System.out.println("Name of Medicine:" + medicineName);
		System.out.println("Address of Company:" + companyAddress);
	}
}
