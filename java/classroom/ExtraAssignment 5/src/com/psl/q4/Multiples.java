package com.psl.q4;

public class Multiples {
	int number;

	public Multiples(int i) {
		// TODO Auto-generated constructor stub
		number = i;
	}

	private void generateMultiples() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+" x "+i+" = "+number*i);
		}
	}

	public static void main(String[] args) {
		Multiples num = new Multiples(4);
		num.generateMultiples();
	}
}
