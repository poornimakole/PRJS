package com.psl.q1;

public class Service {
	
	String serviceName;
	int charges;
	
	public int getData(String serviceName)
	 { int charges;
		 switch(serviceName)
		 {
		 case "TALKTIME":
			     charges=30;
			     return charges;
		 case "SMS":
			 charges=30;
		     return charges;
		 case "2G":
			 charges=99;
		     return charges;
		 case "3G":
			 charges=199;
		     return charges;
		 case "4G":
			 charges=299;
		     return charges;
	     default: 
		   	 return 0;   
		 } 
	 }
}
