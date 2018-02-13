package com.psl.q1;

public class ThreadPriority extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			
				if (Thread.currentThread().getName().equals("Thread1")) 
				{
					System.out.println("Thread 1 is executing");
				} else 
				{
					System.out.println("Thread 2 is executing");
				}
		}
	}
	
	
	public static void main(String[] args) {
		
		ThreadPriority tp=new ThreadPriority();
		
		Thread t1=new Thread(tp,"Thread1");
		Thread t2=new Thread(tp,"Thread2");

		
		t1.setPriority(1);
		t2.setPriority(10);
		
		
		t1.start();
		t2.start();
	}
}
