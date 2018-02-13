package com.psl.q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args) {
		
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("Enter File Name:");
			String file=br.readLine();
			
			File f=new File(file);
			
			if(f.exists()){
				System.out.println("File Exists.......!!!");
			}
			else
			{
				System.out.println("File doesn't exists....!!!");
				f.createNewFile();
			}
			
			System.out.println("Absolute path of file is : "+f.getAbsolutePath());
			
			if(f.canRead() && f.canWrite())
			{
				System.out.println("file is readable and writable.");
			}
			else
			{
				System.out.println("file is not readable and writable.");
			}
			
			System.out.println("Enter the String:");
			String str=br.readLine()+"  ";
			byte b[]=str.getBytes();
			FileOutputStream fos=new FileOutputStream(f);
			fos.write(b);
			fos.close();
			
			fos=new FileOutputStream(f,true);
			System.out.println("Enter the String:");
			 str=br.readLine();
			byte b1[]=str.getBytes();
			  fos.write(b1);
			  fos.close();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
