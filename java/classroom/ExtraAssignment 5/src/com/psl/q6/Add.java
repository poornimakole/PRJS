package com.psl.q6;

public class Add {
	
	public void display(int sum){
		System.out.println("Sum of numbers is:" +sum);
	}
	
	public int add (int... number)
	{
		int sum=0;
		for(int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
		}
		return sum; 
	}
	
	public static void main(String[] args) {
		
		Add ad=new Add();
		int sum=ad.add(6,7);
		ad.display(sum);
		sum=ad.add(1,9,5,3);
		ad.display(sum);
		sum=ad.add(4,7,6);
		ad.display(sum);
	}

}
