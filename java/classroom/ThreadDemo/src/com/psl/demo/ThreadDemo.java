package com.psl.demo;

public class ThreadDemo extends Thread{
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for (int i =1; i <= 10; i++) {
			
			synchronized (this) {
				
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(Thread.currentThread().getName().equals("one"))
			{
				System.out.println(" one: "+3*i);
			}
			else
			{
				System.out.println(" two: "+5*i);
			}
		} 
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Inside main...");
		ThreadDemo obj=new ThreadDemo();
		
		/*Thread t1=new Thread(obj,"one");
		Thread t2=new Thread(obj,"two");*/
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("one");
		t2.setName("two");
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		System.out.println("Before start...");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After start....");
		System.out.println("end main....");
	}

}
