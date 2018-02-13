package com.psl.q2;

import java.util.Date;

public class Contact {
	String firstname, middlename, lastname, email;
	String address, area, city, state, country, website;
	char gender;
	Date dateOfBirth;
	Date anniversary;
	long pincode;
	long telephoneNumber, mobileNumber;

	public Contact(String firstname, String lastname, char gender,
			Date dateOfBirth, String email, long mobileNumber,
			long telephoneNumber) {
		// TODO Auto-generated constructor stub
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.telephoneNumber = telephoneNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		String result = "Name: " + firstname + "  " + lastname
				+ "\nDate of Birth:  " + dateOfBirth.getDate() + "/"
				+ dateOfBirth.getMonth()  + "/"+ dateOfBirth.getYear()
				+ " \nGender: " + gender + "\nTelephone: " + telephoneNumber
				+ "\nMobile:  " + mobileNumber + " \nEmail: " + email+"\n\n";
		return result;
	}

	public void validate() throws IncompleteDataException,
			InvalidEmailException, MissingContactDetailException {
		if (firstname == null || lastname == null || dateOfBirth == null
				|| email == null) {
			throw new IncompleteDataException();
		} else if (!(email.contains("@")) && !(email.contains("."))) {

			throw new InvalidEmailException();
		} else if (telephoneNumber == 0 && mobileNumber == 0) {
			throw new MissingContactDetailException();
		}

	}

	

}
