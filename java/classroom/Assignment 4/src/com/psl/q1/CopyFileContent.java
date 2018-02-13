package com.psl.q1;

import java.io.*;

public class CopyFileContent 
{
	BufferedReader br;
	 FileInputStream in = null;
     FileOutputStream out = null;
     File inputFile=null,outputFile=null;


	String source,destination;
	
	public CopyFileContent(String source,String destination) {
		// TODO Auto-generated constructor stub
		this.source=source;
		this.destination=destination;
		inputFile=new File(source);
		outputFile=new File(destination);
		}
	
	
   	public void checkAvailability()
	{
		try {
			 
			 if(inputFile.exists())
			 {
				 inputFile=new File(source);
				 if(outputFile.exists())
				 {
					 br=new BufferedReader(new InputStreamReader(System.in));
					 outputFile=new File(destination);
					 System.out.println("whether you want to overwrite?(Yes/No)");	 
					 try {
						if((br.readLine()).equalsIgnoreCase("Yes"))
						 {
							 copyContent();
						 }
						 else if((br.readLine()).equalsIgnoreCase("No"))
						 {
							 
						 }
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 
				 }
				 else
				 {
					 try {
						 System.out.println("New File is created...!!!");
						outputFile.createNewFile();
						copyContent();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
			 }
			 else
			 {
				 System.out.println("Please check input file....!!");
			 }
	      
		}
		finally {
	         
	            try {
	            	if(in!=null)
		            {
	            		in.close();
		            }
	            	if(out!=null)
					{
	            		out.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	      }

	}

private void copyContent() {
		// TODO Auto-generated method stub
	  try {
			in = new FileInputStream(inputFile);
		    out = new FileOutputStream(outputFile);
		    int i=0;
			while((i=in.read())!=-1)
			{
			     out.write(i);
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
	CopyFileContent cfc=new CopyFileContent(args[0],args[1]);
	 cfc.checkAvailability();
}
}
