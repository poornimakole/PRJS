package com.psl.q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		
		List<Cities> cList=new ArrayList<Cities>();
		Cities city=new Cities();
		
		   city.setCityId(12);
		   city.setCityName("mapusa");
		   city.setCityInfo("famous for shopping...!!");
		   cList.add(city);
		   
		   city=new Cities();
		   city.setCityId(6);
		   city.setCityName("panjim");
		   city.setCityInfo("government offices..!!!");
		   cList.add(city);
		   
		   city=new Cities();
		   city.setCityId(2);
		   city.setCityName("porvorim");
		   city.setCityInfo("mall de goa...!!");
		   cList.add(city);
		   
		   city=new Cities();
		   city.setCityId(10);
		   city.setCityName("margao");
		   city.setCityInfo("famous for fish...!!");
		   cList.add(city);
		   
		   System.out.println("\nDisplay using foreach");
		   for (Cities cities : cList) {
			   
			   System.out.println(cities);
		}
		   
		   System.out.println("\nDisplay using for loop");
		   for (int i = 0; i < cList.size(); i++) {
			
			   System.out.println(cList.get(i));
		}
		   
		   System.out.println("\nDisplay using iterator");
		   
		   Iterator<Cities> it=cList.iterator();
		   while(it.hasNext())
		   {
			   System.out.println(it.next());
		   }
		   
		   it=cList.iterator();
		   while(it.hasNext())
		   {
			   it.next();
			   it.remove();
		   }
	}

}
