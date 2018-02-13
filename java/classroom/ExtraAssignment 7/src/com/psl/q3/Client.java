package com.psl.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args) {
		
		BankAccount ba=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("Enter initial balance:");
			float balance=Float.parseFloat(br.readLine());
			System.out.println("Enter account type(saving/current):");
			String type=br.readLine().toLowerCase();
			ba=new BankAccount(balance,type);
			int option=0;
			do
			{
				System.out.println("------Menu-----");
				System.out.println("1.deposit");
				System.out.println("2.withdraw");
				System.out.println("3.check balance");
				System.out.println("4.exit");
				System.out.println("Enter option:");
				option=Integer.parseInt(br.readLine());
				switch(option)
				{
				case 1:
					System.out.println("Enter amount to be deposit:");
					 try {
						ba.deposit(Float.parseFloat(br.readLine()));
					} catch (InvalidAmountException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 2:
					System.out.println("Enter amount to be withdraw:");
					 try {
						ba.withdraw(Float.parseFloat(br.readLine()));
					} catch (InsufficientFundsException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 
					break;
				case 3:
					float bal=0;
					try {
						bal = ba.getBalance();
					} catch (LowBalanceException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String type1=ba.getType();
					 if((type1.equals("saving") && bal>1000) || (type1.equals("current") && bal>5000))
						{
						 System.out.println("The available balance is "+bal);
						}
					 else
					 {
						 System.out.println("plzz try again...");
					 }
					break;
				case 4:
					System.exit(0);
					default:
						System.out.println("invalid input...!!!");
				}
			}while(option!=4);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
