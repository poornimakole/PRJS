package com.psl.q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
  
public class SearchName {
	public void search(ArrayList<String> arrayList,String name)
	{
		boolean flag=false;
		Iterator<String> itr=arrayList.iterator();
		  while(itr.hasNext())
		  {
			  if(itr.next().equalsIgnoreCase(name))
			  {
				  
				 flag=true; 
				 break;
			  }
		  }
		  if(flag)
		    System.out.println(name+ "  exist in the list of student....!!");
		  else
		    System.out.println(name+ "  does not exist in the list of student....!!");  
		
	}
	
	public static void main(String[] args) {
		ArrayList<String> arrayList= new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of students:");
		int noOfStudent=s.nextInt();
		for(int i=0;i<noOfStudent;i++)
		{
			System.out.print("Enter student name:");
			arrayList.add(s.next());
		}
		SearchName sn=new SearchName();
		System.out.print("Enter student name to be search:");
		String name=s.next();
		sn.search(arrayList,name);
		s.close();
		
		
	}
}
