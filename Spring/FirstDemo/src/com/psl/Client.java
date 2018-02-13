package com.psl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
  public static void main(String[] args) {
	
	    AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
	    
	    Employee e=(Employee)context.getBean("employee");
	    System.out.println(e.toString());
	    
	    context.registerShutdownHook(); 
    }
}
