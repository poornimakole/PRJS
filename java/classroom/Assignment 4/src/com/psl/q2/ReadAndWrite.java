package com.psl.q2;

import java.io.*;

public class ReadAndWrite {
	File f;
	FileInputStream in = null;
    FileOutputStream out = null;
	
	public ReadAndWrite() {
		// TODO Auto-generated constructor stub
		f=new File("io.txt");		
	}
	

	private void writeToFile(String str) {
		// TODO Auto-generated method stub
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte b[]=str.getBytes();
		try {
			out=new FileOutputStream(f);
			out.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	private void sizeOfFile() {
		// TODO Auto-generated method stub
		System.out.println("The size of the File is : "+f.length());
		
		
	}
	
	private void ReadFromFile() {
		// TODO Auto-generated method stub
		  try {
			in=new FileInputStream(f);
			int i=0;
			System.out.println("The content read from the file is: ");
			while((i=in.read())!=-1)
			{
			     System.out.print((char)i);
			}
			System.out.println();
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
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		
	}
	
	private void DeleteFile() {
		// TODO Auto-generated method stub
		boolean x=f.delete();
		if(x)
		System.out.println("File is deleted...!!!!");
		
	}


	
	public static void main(String[] args) {
		
		ReadAndWrite raw=new ReadAndWrite();
		BufferedReader br=null;
		br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the text:");
		try {
			String str=br.readLine();
			 raw.writeToFile(str);
			 raw.sizeOfFile();
			 raw.ReadFromFile();
	         raw.DeleteFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	

	



}
