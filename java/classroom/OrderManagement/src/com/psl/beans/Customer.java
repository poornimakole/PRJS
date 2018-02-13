package com.psl.beans;

import java.util.List;

public class Customer {
	int id;
	String name;
	String address;
	String email;
	List<PurchaseOrder> purchaseOrderList;

	public Customer(){
		
	}
	
	public Customer(int id, String name, String address, String email,
			List<PurchaseOrder> purchaseOrderList) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.purchaseOrderList = purchaseOrderList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<PurchaseOrder> getPurchaseOrderList() {
		return purchaseOrderList;
	}

	public void setPurchaseOrderList(List<PurchaseOrder> purchaseOrderList) {
		this.purchaseOrderList = purchaseOrderList;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address
				+ ", email=" + email + ", purchaseOrderList="
				+ purchaseOrderList + "]";
	}

}
