package com.psl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addr")

public class Address {
	
	@Value("18 june")
	private String street;
	@Value("panjim")
	private String city;
	@Value("387979")
	private String zip;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
		//System.out.println("Address Constructor");
	}
	public Address(String street, String city, String zip) {
		
		this.street = street;
		this.city = city;
		this.zip = zip;
		System.out.println("Address para Constructor");
	}
	
	
	public Address(String street, String city) {
		this.street = street;
		this.city = city;
		System.out.println("Address with 2 para Constructor");
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
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", zip=" + zip
				+ "]";
	}
	
	public void abc(){
		System.out.println("address init");
	}
	
	public void pqr(){
		System.out.println("address destroy");
	}
	
	
	
	

}
