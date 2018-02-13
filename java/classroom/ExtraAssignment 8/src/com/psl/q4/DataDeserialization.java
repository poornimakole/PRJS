package com.psl.q4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class DataDeserialization {

	
	
    public Set<Student> readFile(String filename)
	{

	    Set<Student> cc=new TreeSet<Student>();
		File f=new File(filename);
		
		if(f.exists()){
			System.out.println("File Exists.......!!!");
		}
		else
		{
			System.out.println("File doesn't exists....!!!");
		}
		
		try(
		     FileInputStream fis=new FileInputStream(f);
			ObjectInputStream ois=new ObjectInputStream(fis);)
			{
			Student s;
			while(fis.available()>0){
				s=(Student) ois.readObject();
				  cc.add(s);
			}
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
		
		return cc;
		
	}
    
    public Map<Character,Set<Student>> sortStudentsAsPerGrade(Set<Student> students)
    {
    	 Map<Character, Set<Student>> sMap=new TreeMap<Character,Set<Student>>();
    	 Set<Character> grade=new TreeSet<Character>();
		  Iterator<Student> itr=students.iterator();
		  
		  while(itr.hasNext())
		  {
			  grade.add(itr.next().getGrade()); 
		  }
		  
		 Iterator<Character> citr=grade.iterator();
		
		 while(citr.hasNext())
		 {
			 Set<Student> st=new TreeSet<Student>();
			 itr=students.iterator();
			 char g=citr.next();
			 while(itr.hasNext())
			 {
				 Student s=itr.next();
				if(s.getGrade()==g) 
				{
					st.add(s);
				}
			 }
			 sMap.put(g,st);
		 }
		  
		  
    	
		return sMap;
    	
    }

	public static void main(String[] args) {
		
		DataDeserialization dd=new DataDeserialization();
		
		Map<Character, Set<Student>> sMap=new TreeMap<Character,Set<Student>>();
		Set<Student> sSet=new TreeSet<Student>();
		  sSet=dd.readFile("Data.ser");
		  System.out.println("Deserialized Data...");
		  System.out.println(sSet);
		  
		  sMap=dd.sortStudentsAsPerGrade(sSet);
		 for (Entry<Character,Set<Student>> student :sMap.entrySet())
		 {
			 System.out.println("Studentd of grade "+student.getKey() +" : ");
			 System.out.println(student.getValue());
			
		 }
		 
	}
}
