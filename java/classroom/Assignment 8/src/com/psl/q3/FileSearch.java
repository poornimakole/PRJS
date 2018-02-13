package com.psl.q3;

import java.io.File;

public class FileSearch 
{
	public boolean searchFile(String path, String filename)
	{
		boolean result=false;
		File file =new File(path+"\\"+filename);
		if(file.isFile())
		{
			result=true;
		}
		   
	   return result;
	}

	public static void main(String[] args) {
		
		FileSearch fc=new FileSearch ();
		String path="C:\\java\\classroom\\Assignment 8";
		String filename="input.txt";
		boolean result=fc.searchFile(path,filename);
		if(result)
		{
			System.out.println(filename +" is present in given path ( "+path+" ).");
		}
		else
		{
			System.out.println(filename +" is not present in given path ( "+path+" ).");
		}
	}
}
