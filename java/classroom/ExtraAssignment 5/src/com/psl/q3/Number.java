package com.psl.q3;

public class Number {
	int number;

	public Number(int i) {
		// TODO Auto-generated constructor stub
		number = i;
	}

	private void findOddEven() {
		// TODO Auto-generated method stub
		if (number % 2 == 0) {
			if (number >= 2 && number <= 5)
				System.out.println("Number is even and between 2 to 5...!!");
			else if (number >= 6 && number <= 20)
				System.out.println("Number is even and between 6 to 20...!!");
			else
				System.out.println("Number is even and greater than 20...!!");
		} else {
			System.out.println("Number is odd...!!");
		}
	}

	public static void main(String[] args) {
		Number num = new Number(14);
		num.findOddEven();
	}

}
