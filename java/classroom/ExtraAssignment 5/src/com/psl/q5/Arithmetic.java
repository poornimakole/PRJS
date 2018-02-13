package com.psl.q5;

public class Arithmetic {
	int sum=0;
	public int add (int... number)
	{
		for(int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
		}
		return sum; 
	}

}
