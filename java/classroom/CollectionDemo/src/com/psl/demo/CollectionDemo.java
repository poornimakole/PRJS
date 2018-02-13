package com.psl.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CollectionDemo {

	public static void main(String[] args) {
		
		List<String> obj =new ArrayList<String>();
		
		obj.add("prabhav");
		obj.add("nishit");
		obj.add("namrata");
		obj.add("madhushree");
		obj.add("lerisa");
		obj.add("prabhav");
		obj.add("nishit");
		obj.add("namrata");
		obj.add("madhushree");
		obj.add("lerisa");
		
		obj.remove("nishit");
		
		System.out.println(obj);
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i));
		}
		
		for (String string : obj) {
			System.out.println(string);
		}
		
		Iterator<String> itr =obj.iterator();
		String str=null;
		while(itr.hasNext())
		{
			str=itr.next();
			if(str.equals("prabhav"))
				itr.remove();
		}
			System.out.println(obj);
			
		
	}
}
