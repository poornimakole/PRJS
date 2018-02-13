package com.psl.medicine;

import java.util.Random;


public class TestMedicine {

	public static void main(String[] args) {

		Medicine md[]=new Medicine[10];
		for(int i=0;i<10;i++)
		{
			Random rd= new Random();
			int r= rd.nextInt(3)+1;
			switch(r)
			{
				case 1:
					md[i]= new Tablet("crocine","xyz");
					md[i].displayLabel();
					break;
				case 2:
					md[i]= new Syrup("ascoril","pqr");
					md[i].displayLabel();
					break;
				case 3:
					md[i]=new Ointment("candid","abc");
					md[i].displayLabel();
					break;
			}
		}
	}

}
