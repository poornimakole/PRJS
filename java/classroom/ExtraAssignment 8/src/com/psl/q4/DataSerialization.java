package com.psl.q4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataSerialization {

public static void main(String[] args) {
		
		Student s1=new Student(1,"pooja",12,'A');
		Student s2=new Student(3,"nidhi",10,'C');
		Student s3=new Student(2,"asmi",11,'B');
		Student s4=new Student(4,"vansh",10,'A');
		
		File f=new File("Data.ser");
		
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
		
		try (
			FileOutputStream  fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);)
			{
				oos.writeObject(s1);
				oos.writeObject(s2);
				oos.writeObject(s3);
				oos.writeObject(s4);
				
				System.out.println("done");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
