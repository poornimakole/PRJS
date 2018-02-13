package com.psl.beans;

import java.util.Date;

public class StockItem {

	
	int id;
	String name;
	String description;
	Units unit;
	Float price;
	Date mfg_date;
	Date Best_before_dt;
	
	public StockItem(){
		
	}
	
	public StockItem(int id, String name, String description, Units unit,
			Float price, Date mfg_date, Date best_before_dt) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.unit = unit;
		this.price = price;
		this.mfg_date = mfg_date;
		this.Best_before_dt = best_before_dt;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Units getUnit() {
		return unit;
	}
	public void setUnit(Units unit) {
		this.unit = unit;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Date getMfg_date() {
		return mfg_date;
	}
	public void setMfg_date(Date mfg_date) {
		this.mfg_date = mfg_date;
	}
	public Date getBest_before_dt() {
		return Best_before_dt;
	}
	public void setBest_before_dt(Date best_before_dt) {
		Best_before_dt = best_before_dt;
	}


	@Override
	public String toString() {
		return "StockItem [id=" + id + ", name=" + name + ", description="
				+ description + ", unit=" + unit + ", price=" + price
				+ ", mfg_date=" + mfg_date + ", Best_before_dt="
				+ Best_before_dt + "]";
	}
	
	
	
	
	
}
