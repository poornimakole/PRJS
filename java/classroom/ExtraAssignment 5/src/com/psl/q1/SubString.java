package com.psl.q1;

public class SubString {
	String stringName;
	int starIndex, endIndex;

	public SubString(String stringName, int startIndex, int endIndex) {
		// TODO Auto-generated constructor stub
		this.stringName = stringName;
		this.starIndex = startIndex;
		this.endIndex = endIndex;
	}

	private void findSubString() {
		// TODO Auto-generated method stub
		String str = stringName.substring(starIndex, endIndex);
		System.out.println("Substring obtained is: " + str);

	}

	public static void main(String[] args) {
		SubString s = new SubString("helloworld", 2, 5);
		s.findSubString();
	}

}
