package com.psl.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PurchaseOrder implements Serializable {

	int orderno;
	Date orderdate;
	Date shipdate; 
	List <OrderItem> ordereditemlist;
	public PurchaseOrder(int orderno, Date orderdate, Date shipdate,
			List<OrderItem> ordereditemlist) {
		super();
		this.orderno = orderno;
		this.orderdate = orderdate;
		this.shipdate = shipdate;
		this.ordereditemlist = ordereditemlist;
	}
	public int getOrderno() {
		return orderno;
	}
	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public Date getShipdate() {
		return shipdate;
	}
	public void setShipdate(Date shipdate) {
		this.shipdate = shipdate;
	}
	public List<OrderItem> getOrdereditemlist() {
		return ordereditemlist;
	}
	public void setOrdereditemlist(List<OrderItem> ordereditemlist) {
		this.ordereditemlist = ordereditemlist;
	}
	@Override
	public String toString() {
		return "PurchaseOrder [orderno=" + orderno + ", orderdate=" + orderdate
				+ ", shipdate=" + shipdate + ", ordereditemlist="
				+ ordereditemlist + "]";
	}
	
	
	
	
	
}
