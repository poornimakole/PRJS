package com.psl.serialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) {
		
		Employee e1=new Employee(107,200000,"aaa");
		Employee e2=new Employee(104,100000,"abd");
		FileOutputStream fos=null;
		File f=new File("Test.ser");
		
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
		
		
		try {
		     fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(e1);
			oos.writeObject(e2);
			System.out.println("done");
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
	}

}
