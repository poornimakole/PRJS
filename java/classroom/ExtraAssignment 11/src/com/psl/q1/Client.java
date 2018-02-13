package com.psl.q1;

public class Client extends Thread {
 
	@Override
	public void run() {
		// TODO Auto-generated method stub
			
				if (Thread.currentThread().getName().equals("Thread1")) 
				{
					System.out.println(Thread.currentThread().getName()+" state is "+Thread.currentThread().getState());
					long t1=System.nanoTime();
					try {
						Thread.sleep((long)Math.random()*3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					long t2=System.nanoTime();
					System.out.println(Thread.currentThread().getName()+" Sleep time is:"+(t2-t1));
					System.out.println(Thread.currentThread().getName()+" state is  "+Thread.currentThread().getState());
				} else 
				{
					System.out.println(Thread.currentThread().getName()+" state is "+Thread.currentThread().getState());
					long t1=System.nanoTime();
					try {
						Thread.sleep((long)Math.random()*3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					long t2=System.nanoTime();
					System.out.println(Thread.currentThread().getName()+" Sleep time is:"+(t2-t1));
					System.out.println(Thread.currentThread().getName()+" state is "+Thread.currentThread().getState());
				}
		}
	
	public static void main(String[] args) {
		
	Client c= new Client();

	   System.out.println("State of Main Thread : "+ Thread.currentThread().getState());
		Thread t1=new Thread(c,"Thread1");
		Thread t2=new Thread(c,"Thread2");
		
		t1.start();
		t2.start();
	}
}