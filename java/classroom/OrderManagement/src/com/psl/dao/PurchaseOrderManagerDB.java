package com.psl.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.psl.beans.OrderItem;
import com.psl.beans.PurchaseOrder;

public class PurchaseOrderManagerDB {

	Boolean insertOrderItem(OrderItem o) {
		return false;
	}

	Boolean insertPurchaseOrder(PurchaseOrder p) {
		return false;
	}

	Boolean insertcustomerOrder(int a, int b) {
		return false;
	}

	ArrayList<PurchaseOrder> getAllOrdersByCustomer(int cust_id) {
		// Return all orders placed by customer
		return null;
	}

	ArrayList<PurchaseOrder> ordersToBeShipped(Date fromdate, Date todate) {
		// Return all orders to be shipped in specified duration.
		return null;
	}

	void deletePurchaseOrder(int orderno) {
		// delete purchase orders
	}

	void deleteOrderItem(int orderno) {
		// delete OrderItems
	}

	void insertShippedOrders(int cust_no, ArrayList<PurchaseOrder> plist,
			ArrayList<OrderItem> olist, String PersonName) {
		// Inserts data into shipped_order_details
	}

}
