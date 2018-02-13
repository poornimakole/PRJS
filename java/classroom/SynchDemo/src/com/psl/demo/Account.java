package com.psl.demo;

public class Account {

	volatile int balance;
	
	public Account(int balance) {
		// TODO Auto-generated constructor stub
		this.balance=balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
