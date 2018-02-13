package com.psl.exception;

public class ExceptionDemo {
	private void display() {
		// TODO Auto-generated method stub
		System.out.println("Display...!!");
	} 
	
	public static void main(String[] args) {
		int result,a=10,b=2;
		ExceptionDemo obj=null;
		try {
			result=a/b;

			System.out.println("Result is: "+result);
			
			//obj.display();
					
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("Hey .. you can not divide by zero...!!");
			
		}
		catch (NullPointerException npe) {
			// TODO: handle exception
			obj=new ExceptionDemo();
			obj.display();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please try again....!!");
		}
		b=2;
		
		result=a/b;
		System.out.println("Result is: "+result);
		System.out.println("All looks good...!!");
	}

	

}
