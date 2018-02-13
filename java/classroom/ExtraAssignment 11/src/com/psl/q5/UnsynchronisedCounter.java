package com.psl.q5;

public class UnsynchronisedCounter extends Thread {

	Counter cn=null;
	int cnt=0;
	
	public UnsynchronisedCounter(Counter cn) {
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
		 UnsynchronisedCounter uc=new UnsynchronisedCounter(c);
		 
		 Thread t1=new Thread(uc,"Thread1");
		 Thread t2=new Thread(uc,"Thread2");
		 Thread t3=new Thread(uc,"Thread3");
		 Thread t4=new Thread(uc,"Thread4");
		 
		 t1.start();
		 t2.start();
		 t3.start();
		 t4.start();
		 
	}
}
