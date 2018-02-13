package com.psl.q4;

public class Counter implements Runnable {

	Storage st=null;

	public Counter(Storage st) {
		// TODO Auto-generated constructor stub
		this.st=st;
	}

	@Override
	public void run() {
	
		 synchronized(st) {
             for(int i = 0 ; i < 10; i++){
                   while(!st.isPrinted()) {             
                      try {
                         st.wait();
                      } catch(Exception e) {  }
                   }
                   st.setValue(i);
                   st.setPrinted(false);
                   st.notify();
             }
       }
		
	}

}
