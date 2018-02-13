package com.psl.mydate;

public class MyDate {
	// to display date

	private int date, month, year;

	/*
	 * private void initDate() { date = 9; month = 10; year = 2017; }
	 */

	/*
	 * public MyDate() { // TODO Auto-generated constructor stub date = 9; month
	 * = 10; year = 2017; }
	 */
	public MyDate() {
		// TODO Auto-generated constructor stub
		this(7,2007);
		date=10;
	}

	public MyDate (int month, int year) {
		// TODO Auto-generated constructor stub
		/*this.date = date;*/
		//this();
		this.month = month;
		this.year = year;
	}

	private void displayDate() {
		System.out.println("Today's date is:" + date + ":" + month + ":" + year);
	}

	public static void main(String[] args) {
	    MyDate obj; // reference
		obj = new MyDate(); // object

		// obj.initDate();
		obj.displayDate();
	}

}
