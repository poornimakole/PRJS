package com.psl.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<Integer,String> obj=new TreeMap<Integer, String>();
		obj.put(1,"prabhav");
		obj.put(4,"nishit");
		obj.put(5,"namrata");
		obj.put(2,"madhushree");
		obj.put(3,"lerisa");
		obj.put(4,"lerisa");
		System.out.println(obj);
	
		Iterator<Integer> itr =obj.keySet().iterator();
		Integer i=null;
	     while(itr.hasNext())
	     {
	    	 i=itr.next();
	    	 System.out.println(obj.get(i));
	     }
	
	     Iterator it =obj.entrySet().iterator();
	     while(it.hasNext())
	     {
	    	 
	    	 System.out.println(it.next());
	     }
	     
	     for (Entry<Integer, String> entry : obj.entrySet()) {
			System.out.println(entry.getKey()+ entry.getValue());
		}
	}
}
