package com.psl.bean;

public class Ticket {

	 private int train_no;
	 private String train_name;
	 private int ticket_no;
	 private String ticket_type;
	 private int price;
	 
	public Ticket() {

		// TODO Auto-generated constructor stub
		System.out.println("Ticket Default Constructor");
	}

	public Ticket(int train_no, String train_name, int ticket_no,
			String ticket_type,int price) {
		this.train_no = train_no;
		this.train_name = train_name;
		this.ticket_no = ticket_no;
		this.ticket_type = ticket_type;
		this.price=price;
		System.out.println("Ticket Parameterised Constructor");
	}

	public int getTrain_no() {
		return train_no;
	}

	public void setTrain_no(int train_no) {
		this.train_no = train_no;
	}

	public String getTrain_name() {
		return train_name;
	}

	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}

	public int getTicket_no() {
		return ticket_no;
	}

	public void setTicket_no(int ticket_no) {
		this.ticket_no = ticket_no;
	}

	public String getTicket_type() {
		return ticket_type;
	}

	public void setTicket_type(String ticket_type) {
		this.ticket_type = ticket_type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Train [train_no=" + train_no + ", train_name=" + train_name
				+ ", ticket_no=" + ticket_no + ", ticket_type=" + ticket_type
				+ ", price=" + price + "]";
	}

	
	
	
	 
	 
}
