package com.psl.q2;

import java.util.Hashtable;

public class ProductInfo {
public static void main(String[] args) {
		
		Product p[]=new Product[10];
		 p[0]=new Product("P001","Maruti800");
		 p[1]=new Product("P002","MarutiZen"); 
		 p[2]=new Product("P003","MarutiEsteem");
		 p[3]=new Product("P004","Alto");
		 p[4]=new Product("P005","wagonar");
		 p[5]=new Product("P006","verna");
		 p[6]=new Product("P007","nano");
		 p[7]=new Product("P008","Maruti800");
		 p[8]=new Product("P009","MarutiZen");
		 p[9]=new Product("P010","MarutiEsteem");
		 
	    Hashtable<String,String> hashproduct=new Hashtable<String, String>();
	    for(int i=0;i<10;i++)
	    {
	    	hashproduct.put(p[i].productId, p[i].productName);
	    }
	    
	    System.out.println(hashproduct);
	    
	    String prodId="P007";
	
		  if(hashproduct.containsKey(prodId))
		  {
			  hashproduct.remove(prodId);
			  System.out.println(prodId+ "  is removed....!!"); 
		  }
		  else
		    System.out.println(prodId+ "  does not exist in the list of product....!!"); 
		  
		    
	    System.out.println(hashproduct);
		  
		}


}
