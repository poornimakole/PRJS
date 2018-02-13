package com.psl.q6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintCollectionData {
	
	void printData(Collection<Integer> data)
	{
		Iterator<Integer> itr=data.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		PrintCollectionData pcd =new PrintCollectionData();
		 List<Integer> aList=new ArrayList<Integer>();
		   aList.add(3);
		   aList.add(7);
		   aList.add(5);
		   aList.add(8);
		   aList.add(2);
		   System.out.println("The data in arrayList:");
		   pcd.printData(aList);
		   
		List<Integer> lList=new LinkedList<Integer>();
		  lList.add(2);
		  lList.add(7);
		  lList.add(66);
		  lList.add(45);
		  System.out.println("The data in linkedList:");
		  pcd.printData(lList);
		  
		  Set<Integer> hSet=new HashSet<Integer>();
		  hSet.add(5);
		  hSet.add(89);
		  hSet.add(34);
		  hSet.add(23);
		  hSet.add(78);
		  System.out.println("The data in hashSet:");
		  pcd.printData(hSet);
		  
		  Set<Integer> tSet=new TreeSet<Integer>();
		  tSet.add(44);
		  tSet.add(51);
		  tSet.add(31);
		  tSet.add(77);
		  tSet.add(80);
		  System.out.println("The data in treeSet:");
		  pcd.printData(tSet);
	   
	 
	}
}
