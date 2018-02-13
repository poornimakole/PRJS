 package com.psl.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeSerializationDemo {
	public static void main(String[] args) {
		File f=new File("Test.ser");
		
		if(f.exists()){
			System.out.println("File Exists.......!!!");
		}
		else
		{
			System.out.println("File doesn't exists....!!!");
		}
		
		FileInputStream fis=null;
		try {
		     fis=new FileInputStream(f);
			@SuppressWarnings("resource")
			ObjectInputStream ois=new ObjectInputStream(fis);
			/*Employee e=(Employee) ois.readObject();
			Employee e1=(Employee) ois.readObject();*/
			Employee e;
			while((e=(Employee) ois.readObject())!=null){
				System.out.println(e);
			}
			//System.out.println(e1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	}


