package com.psl.q4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class NumberOfWords {
	
	public int countWords(String filePath){
		
		int i=0;
		
		    BufferedReader br=null;
			FileInputStream fis=null;
			 StringTokenizer st=null;
			
		    
			File f=new File(filePath);
			if(f.exists())
			{
				System.out.println("file exist!!");
			}
			  try {

				  fis=new FileInputStream(f);
				  br=new BufferedReader(new InputStreamReader(fis));
				  String str=null;
				 
				     while((str=br.readLine())!=null)
				     {
				            st=new StringTokenizer(str," ");
						        i=i+st.countTokens();
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
		return i;
		
	}
  
	public static void main(String[] args) {
		
		NumberOfWords now=new NumberOfWords();
		String path="input.txt";
		 int i= now.countWords(path);
		 System.out.println("The file ("+path+") contains "+i+" words");
	}
}
