package com.psl.q3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Client {

	public static void main(String[] args) {
	
		Set<CityStateMap> ss=new HashSet<CityStateMap>() ;
	
	    CityStateMap csm=null;
	    BufferedReader br=null;
		FileInputStream fis=null;
		 StringTokenizer st=null;
		
	    
		File f=new File("citystatemap.txt");
		  try {
			  fis=new FileInputStream(f);
			  br=new BufferedReader(new InputStreamReader(fis));
			  String str=null;
			     while((str=br.readLine())!=null)
			     {
			    	 csm=new CityStateMap();
			    	 st=new StringTokenizer(str," ");
			    	csm.setCity(st.nextToken());
			    	csm.setState(st.nextToken());
			    	ss.add(csm);
			     }	
			
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
				br.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		  }
		
	    System.out.println(ss);
		  
		 csm=new CityStateMap(); 
		 System.out.println("\nList of all cities are:");
		 csm.getAllCities(ss);
		 System.out.println("\nList of all states are:");
		 csm.getAllStates(ss);
		 System.out.print("\nList of all cities for a state (");
		 csm.getAllCitiesOfState(ss,"goa");
		 System.out.print("\nList after adding new city-state pair:\n");
		 CityStateMap c=new CityStateMap();
		 c.setCity("bicholim");
		 c.setState("goa");
		  Iterator<CityStateMap> itr=ss.iterator();
		  while(itr.hasNext())
		  {
			  if(itr.next().equals(c))
			  {
				  itr.remove();
			  }
		  }
		  ss.add(c);
		  System.out.println(ss);
	      System.out.print("\nList of city-state pair after deleting all cities for state (");
			 csm.deleteAllCitiesOfState(ss,"maharashtra");
			 System.out.println(ss);
		 
		 
		 
		  
		  
	}

	
}
