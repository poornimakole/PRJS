package com.psl.beans;

public class OrderItem {

	StockItem stockitemname;
	int qty;
	public StockItem getStockitemname() {
		return stockitemname;
	}
	public void setStockitemname(StockItem stockitemname) {
		this.stockitemname = stockitemname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "OrderItem [stockitemname=" + stockitemname + ", qty=" + qty
				+ "]";
	}
	public OrderItem(StockItem stockitemname, int qty) {
		super();
		this.stockitemname = stockitemname;
		this.qty = qty;
	}
	
	
	
	
}
