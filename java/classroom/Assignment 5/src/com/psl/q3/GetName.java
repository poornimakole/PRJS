package com.psl.q3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class GetName {
	
	public static void main(String[] args) {
		int choice;
		Scanner s=new Scanner(System.in);
        Vector<Name> v=new Vector<Name>();
     
		do
		{
			System.out.print("Select the option:");
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
				Name n=new Name();
				System.out.print("Enter firstname:");
				n.setFirstname(s.next());
				System.out.print("Enter surname:");
				n.setSurname(s.next());
				v.add(n);
				 break;
			case 2:
				 Name n1=new Name();
				Iterator<Name> itr=v.iterator();
				while(itr.hasNext())
				{
					n1=itr.next();
					System.out.println(n1.getFirstname()+"  "+n1.getSurname());
				}
				break;
			case 3:
				  System.exit(0);
				default:
					System.out.println("Select the correct option...!!");
			}
			
		}while(choice!=3);
		s.close();
	}

}
