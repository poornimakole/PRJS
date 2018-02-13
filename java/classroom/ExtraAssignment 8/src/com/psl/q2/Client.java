package com.psl.q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class Client {
	
	
	
	
	private Map<String,ArrayList<String>> readOrder() {
		// TODO Auto-generated method stub
		Map<String,ArrayList<String>> map=new TreeMap<String,ArrayList<String>>();
		 File f=new File("order.txt");
	      try (
				FileInputStream fis=new FileInputStream(f);
				BufferedReader br=new BufferedReader(new InputStreamReader(fis));
			)
			{
	    	  String data=null;
			  while((data=br.readLine())!=null)
			  {
				  String a[]=data.split(":");
				  String key=a[0];
				  String value=a[1];
				  StringTokenizer st=new StringTokenizer(value,";");
					ArrayList<String> arrayList =new ArrayList<String>();
				   while(st.hasMoreTokens())
				   {
					  
					  arrayList.add(st.nextToken());
				   }
				 
				   map.put(key,arrayList);
			  }
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
	
	
	
	private void search(Map<String, ArrayList<String>> map,Connection con) {
		// TODO Auto-generated method stub
	         try {
				Statement st=con.createStatement();
				for (java.util.Map.Entry<String, ArrayList<String>> itr : map.entrySet()) 
				  {
					String key[]=itr.getKey().split(",");
					String name=key[0];
					long phone=Long.parseLong(key[1]);
					ArrayList<String> arrayList =itr.getValue();
					ResultSet rs=st.executeQuery("select * from person");
					boolean flag=false;
					 while(rs.next())
					 {
						 if(rs.getString(2).equals(name) && rs.getLong(3)==phone)
						 {
							 generateBill(rs.getString(2),arrayList,false,con);
							 flag=true;
							 break;
						 }
					 }
					 if(!flag)
					 {
						 System.out.println("user not found...!!!");
						 int personid = 0;
					    	rs=st.executeQuery("select max(personid) from person");
					    	if(rs.next())
					    	{
					    		personid=rs.getInt(1)+1;
					    	}
					    	st.execute("insert into person values("+personid+",'"+name+"',"+phone+")");
					    	generateBill(name,arrayList,true,con);
					 }
					
			   	  }			
			} catch (SQLException e) {
				// TODO Auto-generated catch blocks
				e.printStackTrace();
			}
		  
		
	}
	
	private void generateBill(String name, ArrayList<String> arrayList,boolean b,Connection con) {
		// TODO Auto-generated method stub
		
		try {
			Statement st=con.createStatement();
			System.out.println("\n\nPersonName	  GroceryType   Quantity (Kgs.)	     Price");
			System.out.println("--------------------------------------------------------------------");
			System.out.print(name+"            ");
			Iterator<String> itr=arrayList.iterator();
			float sum=0;
			 while(itr.hasNext())
			 {
				 String d[]=itr.next().split(",");
				 String groceryType=d[0];
				 float quantity=Float.parseFloat(d[1]);
				 ResultSet rs=st.executeQuery("select price from grocery where groceryName ='"+groceryType+"'");
				 if(rs.next())
				 {
					 System.out.println(groceryType+"             "+quantity+"               "+rs.getInt(1)*quantity );
					 System.out.print("                 ");
					 sum=sum+rs.getInt(1)*quantity;
				 } 
			 }
			 System.out.println();
			 System.out.println("----------------------------------------------------------------------");
			 System.out.println("Total                                                   "+sum);
			 float discount=0;
			 if(b)
			 {
				discount=(sum*20)/100; 
				 System.out.println("discount(20%)                                              "+discount);
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Final Total                                            "+(sum-discount));
			 }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	public static void main(String[] args) {
		
		Client c= new Client();
		
		Map<String,ArrayList<String>> map=new TreeMap<String,ArrayList<String>>();
		
	     DbConnect db=new DbConnect();
         Connection con=db.connectionEstabish(); 
         Statement st=null;
         ResultSet rs=null;
         BufferedReader br=null;
         
		     br=new BufferedReader(new InputStreamReader(System.in));
		   
			    	try {
						st=con.createStatement();
						int personid=1;
				    	rs=st.executeQuery("select max(personid) from person");
				    	if(rs.next())
				    	{
				    		personid=rs.getInt(1)+1;
				    	}
				    	System.out.println("Enter Person name:");
				    	String personName=br.readLine();
				    	System.out.println("Enter Person phone number:");
				    	long personphone=Long.parseLong(br.readLine());
				    	
				    	st.execute("insert into person values("+personid+",'"+personName+"',"+personphone+")");
				    	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	
			    	 map= c.readOrder();   	
			    	 c.search(map,con);
			    	  
			    	
	
		
		 try {
			    rs.close();
		    	st.close();
				con.close();
				br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	

	
}
