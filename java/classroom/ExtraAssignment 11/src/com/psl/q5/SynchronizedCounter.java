package com.psl.q5;

public class SynchronizedCounter extends Thread {

	Counter cn=null;
	int cnt=0;
	
	public SynchronizedCounter(Counter cn) {
		// TODO Auto-generated constructor stub
		this.cn=cn;
	}
	
	static class Counter extends Thread{
		int count;
		  void incrementCount()
		  {
			 count++;
		  }
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			for(int i=0;i<10000;i++)
			{
				cn.incrementCount();
			}
		    cnt++;
		    
			if(cnt==4)
			System.out.println(cn.count);
		}
		
	 public static void main(String[] args) {
		
		 Counter c=new Counter();
		 SynchronizedCounter uc=new SynchronizedCounter(c);
		 
		 Thread t1=new Thread(uc,"Thread1");
		 Thread t2=new Thread(uc,"Thread2");
		 Thread t3=new Thread(uc,"Thread3");
		 Thread t4=new Thread(uc,"Thread4");
		 
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
		 t3.start();
		 try {
				t3.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 t4.start();
		 
	}
}
