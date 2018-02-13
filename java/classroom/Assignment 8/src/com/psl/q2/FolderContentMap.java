package com.psl.q2;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FolderContentMap {
	
	static Map<String, ArrayList<String>> map =new HashMap<String, ArrayList<String>>();
	
	public void listOfFilesInFolder(String path)
	{
		   File directory = new File(path);
	        File[] fileList = directory.listFiles();
	         ArrayList<String> a=new ArrayList<String>();
	        for (File f : fileList){
	        	if(f.isFile())
	        	{
	        		a.add(f.getName().toString());
	        	}
	        	else if(f.isDirectory())
	        	{
	        		listOfFilesInFolder(f.getAbsolutePath());
	        	}
	        	map.put(directory.getAbsolutePath(), a);
	        }
		
	}

	public static void main(String[] args) {
		
		FolderContentMap fcm=new FolderContentMap();
		String path="C:\\java\\classroom\\Assignment 7";
		
				fcm.listOfFilesInFolder(path);
		for(Entry<String, ArrayList<String>> foldername : map.entrySet())
          {
			if(!(foldername.getValue().isEmpty()))
	        System.out.println(foldername.getKey() + " >>" + foldername.getValue());
          }
				
	              
		
	}

}
