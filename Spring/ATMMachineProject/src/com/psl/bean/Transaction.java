package com.psl.bean;

public class Transaction {
	
	private int Account_no;
	private String name;
	private int amount;
	private String status;
	
	
	public int getAccount_no() {
		return Account_no;
	}
	public void setAccount_no(int account_no) {
		Account_no = account_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Transaction [Account_no=" + Account_no + ", name=" + name
				+ ", amount=" + amount + ", status=" + status + "]";
	}
	
	
	

}
