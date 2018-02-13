package com.psl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audiance {
	
	@Pointcut(value="execution(* com.psl.Performer.perform(String,String)) && args(song,artist)")
	
	public void pc1(String song,String artist){	}

	@Before(value="pc1(song,artist)")
	public void takeSeats(String song,String artist){
		System.out.println("Audiance take seats to listern song "+song+" originally sung by "+artist);
	}
	
	@Before(value="pc1(song,artist)")
	public void switchOffPhones(String song,String artist){
		System.out.println("Audiance switch off phones to listern song "+song+" originally sung by "+artist);
	}
	
	@AfterThrowing(value="pc1(song,artist)")
	public void demandRefund(String song,String artist){
		System.out.println("Audiance demand a refund to listern song "+song+" originally sung by "+artist);
	}
	
	@AfterReturning(value="pc1(song,artist)")
	public void applaud(String song,String artist)
	{
		System.out.println("Audiance claps to listern song "+song+" originally sung by "+artist);
	}
	
	@After(value="pc1(song,artist)")
	public void goHome(String song,String artist){
		System.out.println("Audiance went home after listerning song "+song+" originally sung by "+artist);
	}
	
	//@Around(value = "pc1()")
	public void record(ProceedingJoinPoint jp){
		//Before
		System.out.println("Audiance take seats");
		System.out.println("Audiance switch off phones");
		System.out.println( "Audiance start camera");
		
		//during
		 try {
			jp.proceed();//Prrformer.perform();
			System.out.println("Audiance claps");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Audiance demand a refund");
		}
		
		
		
		//After
		System.out.println( "Audiance stop camera");
		System.out.println("Audiance went home");
	}
}
