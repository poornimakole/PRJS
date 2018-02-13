package com.psl.demo;

public class WrapperDemo {
	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		Integer i=new Integer(a);
		System.out.println(i);

		Integer d=a;                                   //autoboxing
		System.out.println(d);
		
		String str="10";
		
		int a2=Integer.parseInt(str);
		System.out.println(a2+10);
		
		String ss=String.valueOf(10);
		System.out.println(ss+10);
	}

}
