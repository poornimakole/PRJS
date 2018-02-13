package com.persistent.app;

import java.util.Random;

public class Advisor {
	String message[] = new String[5];

	public Advisor() {
		// TODO Auto-generated constructor stub
		 message[0] = "never say no";
		 message[1]="be ready to learn new things";
		 message[2]="help others";
		 message[3]="listern to trainer";
		 message[4]="follow all instructions";
	}

	public String getAdvice() {
		Random rd = new Random();
		int r = rd.nextInt(5);
		return message[r];
	}

}
