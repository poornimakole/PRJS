package com.psl.q3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialThread extends Thread {

	int num;
	 String data=null;
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().getName().equals("number"))		
		{
			 File f=new File("number.txt");
		      try (
					FileInputStream fis=new FileInputStream(f);
					BufferedReader br=new BufferedReader(new InputStreamReader(fis));
				)
				{
		    	 
				  while((data=br.readLine())!=null)		  
				  {
					  int d=Integer.parseInt(data);
					  System.out.println(Thread.currentThread().getName()+" : "+data);
					  num=d;
					  wait();
					  notify();
				  }
				 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     
		}
		else
		{
			while(data!=null)
			{		
				int fact=1;
				for (int i = 1; i <=num; i++) {
					fact=fact*i;
				}
				 System.out.println(Thread.currentThread().getName()+" :  “Factorial of "+num+" is "+ fact );
				 
				 notify();
				 try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		FactorialThread ft =new FactorialThread();
		
		Thread t1=new Thread(ft,"number");
		Thread t2=new Thread(ft,"factorial");
		
		t1.start();
		t2.start();
	}
}
