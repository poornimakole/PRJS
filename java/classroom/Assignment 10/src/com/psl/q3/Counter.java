package com.psl.q3;

public class Counter implements Runnable {

	int currentValue=0;
	Storage st=null;

    public Counter(Storage st) {
        this.st=st;
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
	       
			for (int i = 0; i < 5; i++) {
				
					st.setNum(currentValue);
					currentValue++;
					try {
						Thread.sleep(25);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
		
	}

}
