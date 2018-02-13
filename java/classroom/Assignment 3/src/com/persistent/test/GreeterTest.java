package com.persistent.test;

import com.persistent.app.Advisor;
import com.persistent.app.Greeter;



public class GreeterTest 
{
  public static void main (String args[])
  {
	 
	  for(int i=0;i<args.length;i++)
	  {
		  Greeter g=new Greeter(args[i]);
		  String greet=g.sayHello();
		  System.out.println(greet); 
	  }
	  Advisor ad=new Advisor();
	  String message=ad.getAdvice();
	  System.out.println("Advice:  "+message);
	  
	  for(int i=args.length-1;i>=0;i--)
	  {
		  Greeter g=new Greeter(args[i]);
		  g.sayGoodBye();
	  }
  }
  
}
