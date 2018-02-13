package com.psl.q4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ValidateContent {
	
  public static void main(String[] args) {
	  
	  BufferedReader br=null;
		FileInputStream fis=null;
		 StringTokenizer st=null;
		 int count=0;
		 
	    
		File f=new File("movie.txt");
		  try {
			  fis=new FileInputStream(f);
			  br=new BufferedReader(new InputStreamReader(fis));
			  String str=null;
			     while((str=br.readLine())!=null)
			     {
			    	 count=0;
			    	 st=new StringTokenizer(str,",");
			    	count=st.countTokens();
			    	 if(count!=4)
			    	 {
			    		 try {
							throw new InvalidInputException();
						} catch (InvalidInputException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			    	 }
			    	 else
			    	 {
			    		 String s[]=str.split(",");
			    		 if(Language.valueOf(s[2].toLowerCase())!=Language.english && Language.valueOf(s[2].toLowerCase())!=Language.hindi  && Language.valueOf(s[2].toLowerCase())!=Language.marathi )
			    		 {
			    			 try {
								throw new InvalidLanguageException();
							} catch (InvalidLanguageException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			    		 }
			    		 else
			    		 {
			    			try 
			    			{
			    				Integer.parseInt(s[0]);
			    			}
			    			catch(NumberFormatException nfe)
			    			{
			    				// TODO Auto-generated catch block
			    				System.out.println("invalid id.....!!");
			    				nfe.printStackTrace();
			    			}
			    		 }
			    		 
			    	 }
			     }	
			
		  } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  finally
		  {
			  try {
				br.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		  }
}
}
