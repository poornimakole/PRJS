package com.psl.q4;

import java.util.StringTokenizer;

public class StringReverse {
	
	static String  makeReverse (String str){
		 
		String str1 ="";
		StringBuilder sb=null;
		
		StringTokenizer st=new StringTokenizer(str," ");
		 while(st.hasMoreTokens())
		 {
			sb=new StringBuilder(st.nextToken());
			str1=str1+sb.reverse()+" ";
			  
		 }
		return str1;
		
	}
	
	public static void main(String[] args) {
		
		String sentence="to be or not to be";
		System.out.println("Sentence Before Reversing:");
		System.out.println(sentence);
		String result=makeReverse(sentence);
		System.out.println("Sentence After Reversing:");
		System.out.println(result);
		
	}

}
