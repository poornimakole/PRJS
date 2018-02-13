package com.psl.q5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SearchThread extends Thread {
	
	static private String  str1,str2,str3,str4;
	private void search(String str) {
		// TODO Auto-generated method stub
		 File f=new File("input.txt");
	      try (
				FileInputStream fis=new FileInputStream(f);
				BufferedReader br=new BufferedReader(new InputStreamReader(fis));
			)
			{
	    	  boolean flag=false;
	    	  String data=null;
			  while((data=br.readLine())!=null)
			  {
				  flag=false;
				  StringTokenizer st=new StringTokenizer(data," ");
				   while(st.hasMoreTokens())
				   {
					   if(st.nextToken().equals(str))
					   {
						   flag=true;
						   break;
					   }
					  
				   }
				   if(flag)
				   {
					   break;
				   }
			  }
			  if(flag)
			   {
				   System.out.println(str+" : is present.");
			   }
			   else
			   {
				   System.out.println(str+" : is absent.");
			   }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		     if(Thread.currentThread().getName().equals(str1))
		     {
		    	 search(str1);
		    	  try {
		  			Thread.sleep(1000);
		  		} catch (InterruptedException e) {
		  			// TODO Auto-generated catch block
		  			e.printStackTrace();
		  		}
		     }
		     else if(Thread.currentThread().getName().equals(str2))
		     {
		        search(str2);
		        try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		     }
		     else if(Thread.currentThread().getName().equals(str3))
		     {
		    	 search(str3); 
		    	  try {
		  			Thread.sleep(1000);
		  		} catch (InterruptedException e) {
		  			// TODO Auto-generated catch block
		  			e.printStackTrace();
		  		}
		     }
		     else
		     {
		    	 search(str4);
		    	  try {
		  			Thread.sleep(1000);
		  		} catch (InterruptedException e) {
		  			// TODO Auto-generated catch block
		  			e.printStackTrace();
		  		}
		     }
	    }
	
	
	public static void main(String[] args) {
		
		SearchThread st=new SearchThread();
		  str1=args[0];
		  str2=args[1];
		  str3=args[2];
		  str4=args[3];
		  
		  
		Thread t1=new Thread(st,args[0]);
		Thread t2=new Thread(st,args[1]);
		Thread t3=new Thread(st,args[2]);
		Thread t4=new Thread(st,args[3]);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
