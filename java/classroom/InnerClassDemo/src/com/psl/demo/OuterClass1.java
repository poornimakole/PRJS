package com.psl.demo;


public class OuterClass1 {
private static int a=10;
	
	static class InnerClass
	{
		 void display(){
			System.out.println("Inner Display "+a);
		}
	}
	
	
	private void display(){
		
		System.out.println("Outer Display "+a );
		
	}
	public static void main(String[] args) {
		OuterClass1 oc=new OuterClass1();
		oc.display();
		
		OuterClass1.InnerClass ic=new OuterClass1.InnerClass();
		ic.display();
		
		
	}

}
