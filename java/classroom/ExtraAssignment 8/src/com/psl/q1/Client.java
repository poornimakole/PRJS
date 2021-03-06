package com.psl.q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.regex.Pattern;


public class Client {

	
	ArrayList<CustomerBill> getCustomerDetails(String fileName)
	{
		ArrayList<CustomerBill> customerBill=new ArrayList<CustomerBill>();
		CustomerBill cb=new CustomerBill();
		File f=new File(fileName);
		FileInputStream fis=null;
		BufferedReader br=null;
		StringTokenizer st=null;
		
		try {
			fis = new FileInputStream(f);
			br=new BufferedReader(new InputStreamReader(fis));
			String data=null;
			while((data=br.readLine())!=null)
					{
				       st=new StringTokenizer(data,",");
				       if(st.countTokens()!=4)
				       {
				    	   try {
							throw new NoDataFoundException(st.nextToken()+" :Data is incomplete...!!!");
						} catch (NoDataFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				       }
				       else
				       {
				    	   String name=st.nextToken();
					       String month=st.nextToken().toLowerCase();
					       String p=st.nextToken();
					       String fud=st.nextToken();
					       String decimalPattern1 = "([0-9]*)\\.([0-9]*)";
					       String decimalPattern2 = "[0-9]*";
					       boolean match1 = Pattern.matches(decimalPattern1,p);
					       boolean match2 = Pattern.matches(decimalPattern1,fud);
					       boolean match3 = Pattern.matches(decimalPattern2,p);
					       boolean match4 = Pattern.matches(decimalPattern2,fud);
					       if(((!match1)&& (!match3)) ||((!match2) &&(!match4)))
					       {
					    	   try {
								throw new InvalidDataException(name +" :Data is not in proper format....!!!");
							} catch (InvalidDataException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					       }
					       else
					       {	
					    	   cb.setCustomerName(name);
					       	   cb.setTravelMonth(month);
					    	   cb.setPackages(Double.parseDouble(p));
						       cb.setFood(Double.parseDouble(fud));
						       customerBill.add(cb);
					       }
				       }
					}
		} catch (FileNotFoundException e) {
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
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return customerBill;
		
	}

	private void calculateDiscount(ArrayList<CustomerBill> customerBill) {
		// TODO Auto-generated method stub
	     
		Iterator<CustomerBill> itr=customerBill.iterator();
		 while(itr.hasNext())
		 {  double discount=0;
			 CustomerBill cb=itr.next();
			 if(cb.getTravelMonth().equals("april") || cb.getTravelMonth().equals("may") || cb.getTravelMonth().equals("june") || cb.getTravelMonth().equals("july") || cb.getTravelMonth().equals("august"))
			 {
				 discount=0.3*(cb.getPackages())+0.2*cb.getFood();
			 }
			 else if(cb.getTravelMonth().equals("september") || cb.getTravelMonth().equals("october") || cb.getTravelMonth().equals("february") || cb.getTravelMonth().equals("march"))
			 {
				 discount=0.2*cb.getPackages()+0.1*cb.getFood();
			 }
			 else if(cb.getTravelMonth().equals("november") || cb.getTravelMonth().equals("january"))
			 {
				 discount=0.1*cb.getPackages()+0.05*cb.getFood();
			 }
			 
			 double netAmount=cb.getPackages()+cb.getFood()-discount;
			 
			 System.out.println("GoGio Travels");
			 System.out.println("    Name : "+cb.getCustomerName());
			 System.out.println("       Package Cost : "+cb.getPackages() );
			 System.out.println("       Food         : "+cb.getFood());
			 System.out.println("       Discount     : "+discount);
			 System.out.println("--------------------------------------------------------");
			 System.out.println("  Net Payable Amount: "+netAmount);
		 }
	}
	
	public static void main(String[] args) {
		
		Client c=new Client();
		ArrayList<CustomerBill> customerBill =c.getCustomerDetails("customer.txt");
		 
		c.calculateDiscount(customerBill);
		
	}


	
}
