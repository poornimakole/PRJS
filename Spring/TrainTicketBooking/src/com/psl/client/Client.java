package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Passenger;

public class Client {
	
	public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
	    
	    Passenger p=(Passenger)context.getBean("passenger");
	    System.out.println(p.toString());
	}

}
