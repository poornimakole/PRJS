package com.psl;

public class Address2 {
	
	private String street;
	private String city;
	private String zip;
	private String landmark;
	
	
	public Address2() {
		// TODO Auto-generated constructor stub
		//System.out.println("Address Constructor");
	}


	public Address2(String street, String city, String zip, String landmark) {
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.landmark = landmark;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getLandmark() {
		return landmark;
	}


	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}


	@Override
	public String toString() {
		return "Address2 [street=" + street + ", city=" + city + ", zip=" + zip
				+ ", landmark=" + landmark + "]";
	}
	
	
	
	
	
	

}
