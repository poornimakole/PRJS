package com.psl.q2;

public class NumberAvailability 
{
	static int findPosition(int num,int[] nos)
	{
		int count=0,i;
		int l=nos.length;
		for(i=0;i<l;i++)
		{
			if(nos[i]==num)
			{
				count=1;
				break;
			}
		}
		if(count==0)
			return -1;
		else
			return i;
		
	}
	public static void main(String[] args)
	{
		int num=67;
		int array[]={67,56,7,90,44};
		int result=findPosition(num,array);
		if(result==-1)
			System.out.println("number is not available");
		else
	   	 System.out.println(num+" is present at index:"+result);

				
	}
}
