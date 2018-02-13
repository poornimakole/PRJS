package com.psl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TicketCollector {
	
	@Pointcut(value="execution(* com.psl.Train.trainRunOnTime(..))")
	
	public void tc1(){ }
	@Around("tc1()")
	public void checkingTicket(ProceedingJoinPoint jp)
	{
		//before
		System.out.println("TC prints passenger list....");
		
		//during
		try {
			jp.proceed();
			System.out.println("TC checks ticket...");
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("TC collects fine...");
		}
		
		//after
	}
	

}
