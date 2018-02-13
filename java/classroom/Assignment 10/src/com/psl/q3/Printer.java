package com.psl.q3;

public class Printer implements Runnable {

	Storage st=null;
	
	public Printer(Storage st) {
		// TODO Auto-generated constructor stub
	        this.st=st;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName()+"  :" + st.getNum());				
			}
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 
	} 

}
