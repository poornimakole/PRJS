package com.psl.demo;

public class OuterClass {
	
	private int a=10;
	
	class InnerClass
	{
		 void display(){
			System.out.println("Inner Display "+a);
		}
	}
	
	
	private void display(){
		
		System.out.println("Outer Display "+a );
		
	}
	public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		oc.display();
		
		OuterClass.InnerClass ic=oc.new InnerClass();
		ic.display();
		
		
	}

}
