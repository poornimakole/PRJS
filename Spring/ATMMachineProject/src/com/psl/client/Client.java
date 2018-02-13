package com.psl.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Transaction;
import com.psl.bean.User;
import com.psl.service.UserService;

public class Client {

public static void main(String[] args) {
		

		ApplicationContext context=new ClassPathXmlApplicationContext("Db.xml");
		
		UserService s =context.getBean("service",UserService.class);
		User u =context.getBean("user",User.class);
		
//		s.createUser(u);

//		s.deposit(u);
//		s.deposit(u);
//		s.withdraw(u);
//		s.deposit(u);
//		s.withdraw(u);
//		s.withdraw(u);
//		
		List<Transaction> tList=s.miniStatement();
		
		for (Transaction transaction : tList) {
			System.out.println(transaction);
		}
		
		
		System.out.println("done!");
		
	}
	
}
