package com.psl.client;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.psl.beans.Customer;
import com.psl.beans.OrderItem;
import com.psl.beans.PurchaseOrder;
import com.psl.beans.StockItem;
import com.psl.dao.CustomerManagerDb;
import com.psl.dao.StockItemManagerDB;

public class Client {

	public static void main(String[] args) {
		
		
	
		
		StockItemManagerDB simdb = new StockItemManagerDB();
		
		
		ArrayList<StockItem> silist = simdb.getStockItems();
		
		StockItem si = new StockItem();
		StockItem si2 = new StockItem();
		StockItem si3 = new StockItem();
		
		
		
		
		for (StockItem stockItem : silist) {
			System.out.println(stockItem);
		}
		
		int count = 0;
		
		List <OrderItem> c1olist = new ArrayList<OrderItem>();
		List <OrderItem> c2olist = new ArrayList<OrderItem>();
		List <OrderItem> c3olist = new ArrayList<OrderItem>();
		
		
		for (StockItem stockItem : silist) {
			
		if(count==0 || count==1)	{
			si = stockItem;
			OrderItem oi = new OrderItem(si,4);
			
			c1olist.add(oi);
		}
		if(count==1|| count==2)	{
			si2 = stockItem;
			OrderItem oi2 = new OrderItem(si2,4);
			c2olist.add(oi2);
		}
		if(count==2|| count==3)	{
			si3 = stockItem;
			OrderItem oi3 = new OrderItem(si3,4);
			c3olist.add(oi3);

		}
			count++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		PurchaseOrder po = new PurchaseOrder(1,new Date(2017,10,21),new Date(2017,10,30),c1olist);
		PurchaseOrder po2 = new PurchaseOrder(1,new Date(2017,10,21),new Date(2017,10,30),c2olist);
		PurchaseOrder po3 = new PurchaseOrder(1,new Date(2017,10,21),new Date(2017,10,30),c3olist);
		
		List<PurchaseOrder> polist = new ArrayList<PurchaseOrder>();
		List<PurchaseOrder> polist2 = new ArrayList<PurchaseOrder>();
		List<PurchaseOrder> polist3 = new ArrayList<PurchaseOrder>();
		
		polist.add(po);
		polist2.add(po2);
		polist3.add(po3);
		
		Customer c1 = new Customer(1,"prajyot","goa","prajyot@gmail.com",polist);
		Customer c2 = new Customer(2,"prabhav","goa","prabhav@gmail.com",polist2);
		Customer c3 = new Customer(3,"ashish","goa","ashish@gmail.com",polist3);
		
		
		
		
		
		float s1=0,s2=0,s3=0;
		
		
		
	
		
		CustomerManagerDb cmdb = new CustomerManagerDb();
		
		System.out.println("\nCustomer Id : "+c1.getId());
		System.out.println("\nCustomer Name : "+c1.getName());
		
		System.out.println("\nOrder Date : "+po.getOrderdate()+" Ship Date : "+po.getShipdate());
		
		System.out.println("\nOrder Item      Quantity     Price     Total Price");

	for (OrderItem oi : c1olist) {
			
		
		System.out.println(oi.getStockitemname().getName()+"\t"+oi.getQty()+"\t"+oi.getStockitemname().getPrice()+"\t"+oi.getQty()*oi.getStockitemname().getPrice());
		s1 = s1 + oi.getQty()*oi.getStockitemname().getPrice();
	}
		
	System.out.println("Grand Total : "+s1);
		System.out.println("\nCustomer Id : "+c2.getId());
		System.out.println("\nCustomer Name : "+c2.getName());
		
		System.out.println("\nOrder Date : "+po2.getOrderdate()+" Ship Date : "+po2.getShipdate());
		
		System.out.println("\nOrder Item      Quantity     Price     Total Price");

	
		for (OrderItem oi : c2olist) {
			
			
			System.out.println(oi.getStockitemname().getName()+"\t"+oi.getQty()+"\t"+oi.getStockitemname().getPrice()+"\t"+oi.getQty()*oi.getStockitemname().getPrice());
			s2 = s2 + oi.getQty()*oi.getStockitemname().getPrice();

		}
		System.out.println("Grand Total : "+s2);

		System.out.println("\nCustomer Id : "+c3.getId());
		System.out.println("\nCustomer Name : "+c3.getName());
		
		System.out.println("\nOrder Date : "+po3.getOrderdate()+" Ship Date : "+po3.getShipdate());
		
		System.out.println("\nOrder Item      Quantity     Price     Total Price");

		for (OrderItem oi : c3olist) {
			
			
			System.out.println(oi.getStockitemname().getName()+"\t"+oi.getQty()+"\t"+oi.getStockitemname().getPrice()+"\t"+oi.getQty()*oi.getStockitemname().getPrice());
			s3 = s3 + oi.getQty()*oi.getStockitemname().getPrice();

		}		
		System.out.println("Grand Total : "+s3);

	}
	
	
}
