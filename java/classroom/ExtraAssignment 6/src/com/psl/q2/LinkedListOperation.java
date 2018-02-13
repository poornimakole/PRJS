package com.psl.q2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListOperation {
	
	public static void main(String[] args) {
		List<Integer> lList =new LinkedList<Integer>();
		  lList.add(3);
		  lList.add(8);
		  lList.add(6);
		  lList.add(19);
		
		  System.out.println("List before performing any operation: ");
		  for (Integer it : lList) {
			System.out.println(it);
		}
		  
		  lList.add(0,20);
		  
		  System.out.println("List after adding element at first position: ");
		  for (Integer it : lList) {
			System.out.println(it);
		}
		  
		  lList.remove(lList.size()-1);
		  
		  System.out.println("List after deleting last element: ");
		  for (Integer it : lList) {
			System.out.println(it);
		}
		  
	     System.out.println("Element at first position is: "+ lList.get(0)); 
	}

}
