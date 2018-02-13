package com.psl.q1;

import java.io.File;
public class FolderContent {
	
	public void displayFolderContents(String path)
	{
		   File directory = new File(path);
	        File[] fileList = directory.listFiles();
	        for (File f : fileList){
	        	if(f.isFile())
	            System.out.println(directory.getAbsolutePath()+"   >>  "+f.getName());
	        	else if(f.isDirectory())
	        	{
	        		displayFolderContents(f.getAbsolutePath());
	        	}
	        }
	}

	public static void main(String[] args) {
		
		FolderContent fc=new FolderContent();
		String path="C:\\java\\classroom\\Assignment 7";
		fc.displayFolderContents(path);
		
	}
}
