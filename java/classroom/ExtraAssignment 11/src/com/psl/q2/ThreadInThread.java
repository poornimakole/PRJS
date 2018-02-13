package com.psl.q2;

public class ThreadInThread extends Thread {

	Integer i = 1;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (i <100) {
			i++;

			Thread t=new Thread(this, i.toString());
			t.start();
			try {
				t.join();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Hello this is Thread "+ Thread.currentThread().getName());


	}

	public static void main(String[] args) {

		ThreadInThread tit = new ThreadInThread();

		Thread t1 = new Thread(tit, "1");
		t1.start();
	}
}
