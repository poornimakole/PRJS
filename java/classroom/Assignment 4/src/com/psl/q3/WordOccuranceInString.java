package com.psl.q3;

import java.util.StringTokenizer;

public class WordOccuranceInString {
	
	
	static int check(String sentence,String word){
		int i=0;
		StringTokenizer st=new StringTokenizer(sentence," ");
		 while(st.hasMoreTokens())
		 {
			 if(st.nextToken().equalsIgnoreCase(word))
			 {
				 i++;
			 }
		 }
		
		return i;
		
	}
	
	public static void main(String[] args) {
		
		String sentence="to be or not to be .....!!!";
		String word="be";
		int result=check(sentence,word);
		System.out.println("The word ("+word+") in sentence (" +sentence+") occurs "+result+" times.");
	}

}
