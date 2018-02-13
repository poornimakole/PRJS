package com.psl.q3;

import java.util.ArrayDeque;

public class ArrayDeQueueOperation {

	public static void main(String[] args) {
		City c=new City();
		ArrayDeque<City> adq=new ArrayDeque<City>();
		
		  c.setCityId(2);
		  c.setCityName("mapusa");
		  adq.add(c);
		  
		  c=new City();
		  c.setCityId(1);
		  c.setCityName("panjim");
		  adq.add(c);
		  
		  c=new City();
		  c.setCityId(3);
		  c.setCityName("margao");
		  adq.add(c);
		  
		  c=new City();
		  c.setCityId(5);
		  c.setCityName("ponda");
		  adq.add(c);
		  
		  c=new City();
		  c.setCityId(4);
		  c.setCityName("porvorim");
		  adq.add(c);
		  
		  System.out.println("Content of Array Deque before performing any operation:");
		  for (City city : adq) {
			System.out.println(city);
		  }
			System.out.println("First element of deque is :"+adq.getFirst());
		    
			System.out.println("Last element of deque is :"+adq.getLast());
			adq.removeLast();
			
			System.out.println("Content of Array Deque after removing last element:");
			  for (City city : adq) {
				System.out.println(city); 
		  }
		  // adq.add(null);
		//Array Deque does not take null values. It gives nullpointer exception	 
	}
}
