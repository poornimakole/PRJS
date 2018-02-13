package com.psl.q4;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class UniqueCharacter {
	
	static Map<String,Integer> map=new TreeMap<String, Integer>();
	private int findUniqueCharacters(String str) {
		// TODO Auto-generated method stub
		char c[]=str.toCharArray();
		Set<Character> cSet =new TreeSet<Character>();
		for (int i = 0; i < c.length; i++) {
			cSet.add(c[i]);
		}
		int result=cSet.size();
		return result;
	}
	
	public static void main(String[] args) {
		UniqueCharacter uc=null; 
		int noOfUniqueCharacter;
		boolean flag=false;
		String str[]={"abcaagfabbc","abcaagfabbc","poornima","abcaagfabbc","abcaagfabbc","poornima"};
		for(int i=0;i<str.length;i++)
		{
			flag=false;
			for ( Entry<String ,Integer> m : map.entrySet()) {
				if(m.getKey().equals(str[i]))
				{
					System.out.println("Unique characters in ( "+m.getKey()+" ) is "+m.getValue());
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				uc=new UniqueCharacter();
				noOfUniqueCharacter=uc.findUniqueCharacters(str[i]);
				System.out.println("Unique characters in ( "+str[i]+" ) is "+noOfUniqueCharacter);
				map.put(str[i], noOfUniqueCharacter);
			}
			
		}
	
		
	}

	

}
