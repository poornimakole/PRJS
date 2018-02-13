package com.psl.demo;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IODemo {
	public static void main(String[] args) {
		File f=new File("Test.txt");
		
		if(f.exists()){
			System.out.println("File Exists.......!!!");
		}
		else
		{
			System.out.println("File doesn't exists....!!!");
		}
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());*/
		
		String str="Writting into  a file......!!!";
		byte b[]=str.getBytes();
		FileOutputStream fos=null;
		
		try {
		     fos=new FileOutputStream(f);
			fos.write(b);
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
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		FileInputStream fis=null;
		  try {
			fis=new FileInputStream(f);
			
			Scanner sc=new  Scanner(fis);
			String str1;
			sc.useDelimiter("  ");
			while(sc.hasNext())
		   {
				str1=sc.next();
				System.out.println(str1);
		   }
			
			/*BufferedReader br=new BufferedReader(new InputStreamReader(fis));
			String str1= br.readLine();
			System.out.println(str1);*/
			
			
			
			/*int i=0;
			while((i=fis.read())!=-1)
			{
			    // System.out.print((char)i);
			}*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
