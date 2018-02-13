package com.psl.demo;

public class OuterClass3 {
	
private int a=10;

	 void display(){
		
		System.out.println("Outer Display "+a );
		
		InnerClass in=new InnerClass();
		in.display();
		
	}

	class InnerClass
	{
		 void display(){
			System.out.println("Inner Display "+a);
		}
	}
	
	
	
	public static void main(String[] args) {
		OuterClass3 oc=new OuterClass3(){
			@Override
			void display() {
				// TODO Auto-generated method stub
				System.out.println("Overriden display method");
			}
		};
		
		oc.display();
		
	MyInterface interfaces =new MyInterface() {
		//object of anonymous inner class
		
		@Override
		public void myMethod() {
			// TODO Auto-generated method stub
			System.out.println("My method");
			
		}
	};
	interfaces.myMethod();
	}

}
