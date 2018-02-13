package com.psl.exception;

public class UserDefException {
	private void validateAge(int age)throws InvalidAgeException{
		
			if (age < 18) {
				throw new InvalidAgeException("Invalid Age...!!");
			}
			else
				System.out.println("Else");
		
	}
	public static void main(String[] args) {
		
		int age=17;
		
		UserDefException obj= new UserDefException();
		
		System.out.println("Before assert...!!");
		
		assert age>18 :"Invalid age";
		
		System.out.println("Before assert...!!");
		try {
			obj.validateAge(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
