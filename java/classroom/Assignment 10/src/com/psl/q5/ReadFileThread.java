package com.psl.q5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileThread extends Thread {
	
	 static String file1, file2;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().getName().equals(file1))
		{
			readContent(file1);
		}
		else
		{
			readContent(file2);
		}
	}
	
	private void readContent(String file) {
		// TODO Auto-generated method stub
		
		 File f=new File(file);
	      try (
				FileInputStream fis=new FileInputStream(f);
				BufferedReader br=new BufferedReader(new InputStreamReader(fis));
			)
			{
	    	  String data=null;
			  while((data=br.readLine())!=null)
			  {
				  System.out.println(file+" : "+data);
				  try {
						Thread.sleep((long)(Math.random() * 1000));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			  }
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		
		ReadFileThread rft=new ReadFileThread();
		 
		file1=args[0];
		file2=args[1];
		Thread t1=new Thread(rft,args[0]);
		Thread t2=new Thread(rft,args[1]);
		
		t1.start();
		t2.start();
		
	}

}
