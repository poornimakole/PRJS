package com.psl.q2;

public class InvalidEmailException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmailException() {
		// TODO Auto-generated constructor stub
		super("Email ID is invalid....!!!\n Correct format(abc@xyz.pqr)..!!!!");
	}

}
