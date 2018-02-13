package com.psl.q4;

public class ThreadPriorityDelay extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
			for (int i = 0; i < 5; i++) {
				
				if (Thread.currentThread().getName().equals("Thread1")) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Thread 1 is executing");
				} else {
					System.out.println("Thread 2 is executing");
				}
			}
	}
	
	
	
	public static void main(String[] args) {
		
		ThreadPriorityDelay tpd=new ThreadPriorityDelay();
		
		Thread t1=new Thread(tpd,"Thread1");
		Thread t2=new Thread(tpd,"Thread2");
		
		t1.setPriority(10);
		t2.setPriority(1);
		
		t1.start();
		t2.start();
		
		
	}
}
