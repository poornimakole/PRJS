package com.psl.q5;

public class Adder extends Arithmetic 
{
  @Override
	public int add(int... number) {
		// TODO Auto-generated method stub
	  
	 return super.add(number)+10;
	
	 
	}
public static void main(String[] args) {
	Arithmetic a=new Arithmetic();
	Adder ad=new Adder();
	int result=a.add(3,4,5);
	System.out.println("Result before override: "+result);
	   result=ad.add(3,4,5);
    System.out.println("Result after override: "+result);
}
}
