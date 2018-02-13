package com.psl.q4;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;


public class TreeMapOperation {

	public static void main(String[] args) {
		NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
		
		City c=new City();
		  c.setCityId(004);
		  c.setCityName("pune");
		  map.put(c.getCityId(), c.getCityName()); 
		  
		  c=new City();
		  c.setCityId(002);
		  c.setCityName("mumbai");
		  map.put(c.getCityId(), c.getCityName()); 
		  
		  c=new City();
		  c.setCityId(001);
		  c.setCityName("nagpur");
		  map.put(c.getCityId(), c.getCityName()); 
		  
		  c=new City();
		  c.setCityId(006);
		  c.setCityName("kolhapur");
		  map.put(c.getCityId(), c.getCityName()); 
		  
		  c=new City();
		  c.setCityId(003);
		  c.setCityName("aurangabad");
		  map.put(c.getCityId(), c.getCityName()); 
		  c=new City();
		  c.setCityId(005);
		  c.setCityName("solapur");
		  map.put(c.getCityId(), c.getCityName()); 
		  
		  System.out.println("\n Content of map: ");
		  for (Entry<Integer,String> entry : map.entrySet()) {
			  System.out.println(entry.getKey()+"  "+entry.getValue());	
		   }
		  
		  System.out.println("\n Content of map in descending order: ");
		  NavigableMap<Integer,String> map1=new TreeMap<Integer,String>();
		  map1=map.descendingMap();
		  for (Entry<Integer,String> entry : map1.entrySet()) {
			  System.out.println(entry.getKey()+"  "+entry.getValue());	
		   }
		  
		  System.out.println("\n Content of map with value of least key greater than or equal to key 005: ");
		  Entry<Integer,String> entry1= map.ceilingEntry(005);
		  System.out.println(entry1.getKey()+"  "+entry1.getValue());	
		  
		  System.out.println("\n Content of map whose keys are greater than or equal to 003: ");
		  map1=map.tailMap(003,true);
		  for (Entry<Integer,String> entry : map1.entrySet()) {
			  System.out.println(entry.getKey()+"  "+entry.getValue());	
		   }
		  
		  System.out.println("\n Content of map including key 002 to key 006 excluding: ");
		  map1=map.subMap(002,true,006,false);
		  for (Entry<Integer,String> entry : map1.entrySet()) {
			  System.out.println(entry.getKey()+"  "+entry.getValue());	
		   }
		 
		  NavigableMap<Integer, String> sortedMap = new TreeMap<Integer, String>(new SortByValue(map));
		  sortedMap.putAll(map);
		  
		  System.out.println("\n Content of map after sort by value: ");
		  for (Entry<Integer,String> entry : sortedMap.entrySet()) {
			  System.out.println(entry.getKey()+"  "+entry.getValue());	
		  }
		   
	}

	
}
