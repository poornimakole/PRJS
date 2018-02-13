package com.psl.q3;

import java.io.Serializable;
import java.util.List;

public class Contact implements Serializable,Comparable<Contact> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6679945705797867099L;
	
	int contactID;
	String ContactName;
	String emailAddress;
	List<String> contactNumber;
	
	
	public int getContactID() {
		return contactID;
	}
	public void setContactID(int contactID) {
		this.contactID = contactID;
	}
	public String getContactName() {
		return ContactName;
	}
	public void setContactName(String contactName) {
		ContactName = contactName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public List<String> getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(List<String> contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Contact :" + contactID + "  "
				+ ContactName + "  " + emailAddress
				+ " " + contactNumber ;
	}
	@Override
	public int compareTo(Contact o) {
		// TODO Auto-generated method stub
		int i=0;
		if(this.contactID<o.contactID)
			i=-1;
		else if(this.contactID>o.contactID)
			i=1;
		return i;
	}

	
	
	
}
