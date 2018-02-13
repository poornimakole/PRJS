package com.psl.demo;

public class OuterClass2 {
	
private int a=10;
	
	private void display(){
		 class InnerClass
			{
				 void display(){
					System.out.println("Inner Display "+a);
				}
			}
			
		
		System.out.println("Outer Display "+a );
		
		InnerClass in=new InnerClass();
		in.display();
		
	}
	public static void main(String[] args) {
		OuterClass2 oc=new OuterClass2();
		oc.display();
		
	}


}
