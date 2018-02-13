package com.psl.q3;

public class BankAccount {
	 String type;
	 float balance;
	 
	 
	 public BankAccount(float balance,String type) {
		// TODO Auto-generated constructor stub
		 this.balance=balance;
		 this.type=type;
		 
	}
	 
	 public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	 
	 public String getType() {
			return type;
		}
	 public void setType(String type) {
			this.type = type;
		}

	void deposit(float amt) throws InvalidAmountException
	 {
		if(amt<0)
		{
				throw new InvalidAmountException("Negative amount is not acceptable.....!!!");
			
		}
		else
		{
			balance=balance+amt;
		}
	 }
	 
	 void withdraw(float amt) throws InsufficientFundsException
	 {
		 if(type.equals("saving") && balance>1000 && balance-1000> amt)
		 {
			 balance=balance-amt;
			 System.out.println("amount is withdrawn.....!!!");
		 }
		 else if(type.equals("current") && balance>5000 && balance-5000>amt)
		 {
			 balance=balance-amt;
			 System.out.println("amount is withdrawn.....!!!");
		 }
		 else
		 {
				throw new InsufficientFundsException("No sufficient balance to withdraw.....!!");
		 }
	 }
	 
	 float getBalance() throws LowBalanceException
	 {
		 if((type.equals("saving") && balance<1000) || (type.equals("current") && balance<5000))
		 {
				throw new LowBalanceException("currently your balance is below minimum balance required....!!!");
			
		 }
		return balance;		 
	 }

	


}
