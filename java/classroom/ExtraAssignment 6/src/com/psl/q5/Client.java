package com.psl.q5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Client {
	
	public static void main(String[] args) {
		Map<String,Long> map=new HashMap<String, Long>();
		PhoneBook pb=null; 
		int option=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("Select option:");
			try {
				option=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch(option)
			{
			case 1:
				pb=new PhoneBook();
				try {
					System.out.println("Enter name:");
					pb.setName(br.readLine());
					System.out.println("Enter phone number:");
					pb.setPhoneNumber(Long.parseLong(br.readLine()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				map.put(pb.getName(), pb.phoneNumber);
				break;
			case 2:
				pb=new PhoneBook();
				String name=null;
				System.out.println("Enter name:");
				  try {
					name=br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  boolean flag=false;
				  for (Entry<String,Long> entry :map.entrySet()) {
					  if(entry.getKey().equals(name))
					  {
						 System.out.println("Phone number of ( "+entry.getKey()+" ) is : "+entry.getValue()); 
						 flag=true;
						 break;
					  }
				}
				  if(!flag){
					  System.out.println("Phone number is not available..!!!");
				  }
				  break;
			case 3:
				 System.exit(0);
			 default:
				 System.out.println("Invalid option...!!!");
			}
			
		}while(option!=3);
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
