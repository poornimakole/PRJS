package com.psl.q3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CityStateMap {
	String city;
	String state;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	@Override
	public String toString() {
		return city + "  " + state+"\n";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityStateMap other = (CityStateMap) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}
	
	
	public void getAllCities(Set<CityStateMap> ss) {
		// TODO Auto-generated method stub
		Iterator<CityStateMap> itr=ss.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getCity());
		}
		
	}
	
	public void getAllStates(Set<CityStateMap> ss) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<String>();
		Iterator<CityStateMap> itr=ss.iterator();
		  while(itr.hasNext())
		  {
			  s.add(itr.next().getState());
		  }
		  
		  for (String str : s) {
			System.out.println(str);
		}
		
			
		}
	
	public void getAllCitiesOfState(Set<CityStateMap> ss, String state) {
		// TODO Auto-generated method stub
		System.out.println(state+") is:");
		Iterator<CityStateMap> itr=ss.iterator();
		while(itr.hasNext())
		{
			CityStateMap cs=itr.next();
			if(cs.getState().equalsIgnoreCase(state))
			   System.out.println(cs.getCity());
		}
		
	}
	public void deleteAllCitiesOfState(Set<CityStateMap> ss, String state) {
		// TODO Auto-generated method stub
		System.out.println(state+") is:");
		Iterator<CityStateMap> itr=ss.iterator();
		while(itr.hasNext())
		{
			if(itr.next().getState().equalsIgnoreCase(state))
			 itr.remove();
		}
	}
	}
	
	
	
	
	

