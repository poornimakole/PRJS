package com.psl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Suggestion {
	
	@Pointcut(value="execution(* com.psl.Order.placeOrder(..))")
	
	public void suggest(){ } 
	
	@Around(value="suggest()")
	public void help(ProceedingJoinPoint jp)
	{
		int t1=(int) System.currentTimeMillis();
		//before
		 System.out.println("offered a small list of suggested items like matching rug, table cover ");
		
		//during
		 try {
			jp.proceed();
			System.out.println("complimentary shopping voucher is added to the user�s profile to shop the next time");
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		int t2=(int)System.currentTimeMillis();
		
		System.out.println("Total time taken for shopping is"+(t2-t1)+" msec");
	}

}
