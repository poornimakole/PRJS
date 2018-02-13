package com.psl.q4;

public class CombinationPermutation {
	int count=0;
	private void permutation(String prefix, String input,String[] combinationArray) {
		// TODO Auto-generated method stub
		if(input.length()==0)
		{
			combinationArray[count]=prefix;
			count++;
		}
		else
		{
			for(int j=0;j<input.length();j++)
			{
				permutation(prefix+input.charAt(j), input.substring(0, j)+input.substring(j+1, input.length()), combinationArray);
				
			}
		}
		
	}
	
		public String[] combination(String input) {
			int factorial=1;
			for(int i=1;i<=input.length();i++)
			{
				factorial=factorial*i;
			}
			String combinationArray[]=new String[factorial];
			permutation("",input,combinationArray);
		
			return combinationArray;
			
		}

		

		public static void main(String[] args) 
		{
			CombinationPermutation c= new CombinationPermutation();
			String[] result=c.combination("1234");
			System.out.println("output:");
			for(int i=0;i<result.length;i++)
			{
				System.out.println(result[i]);
			}
		}

}
