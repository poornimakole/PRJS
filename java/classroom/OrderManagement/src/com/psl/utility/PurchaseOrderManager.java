package com.psl.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.psl.beans.Customer;
import com.psl.beans.OrderItem;
import com.psl.beans.PurchaseOrder;
import com.psl.beans.StockItem;

public class PurchaseOrderManager {

	ArrayList<Customer> populateCustomers() {
		// Read data from file provided to you customers.txt and create
		// ArrayList.
		return null;
	}

	ArrayList<StockItem> populateStoreItems() {
		// Read data from items.txt file and create ArrayList.
		return null;
	}

	void createOrder(int cust_id,List<OrderItem> olist, Date ship_date) {

		// Purchase order for customer will be generated for current date and
		// shipping date will set as per customer’s request. If customer does
		// not specify then set the date after 6 days of order date.
		
		
		
		
		
		

	}

	void storePurchaseOrder() {
		// Store PurchaseOrder Object into File. Don’t store Stock Items details
		// (name file as PoNo_99.ser in folder Purchase_Order.

	}

	void shipOrders() {
		// Removes all orders from Purchase_Order_details & order_Item_details
		// table and store into shipped_order table.

	}

	void removeExpiredItems() {
		// Removes expired Items from arraylist() as well as Database.

	}

	void showItems() {
		// Display all items List. Sort Items as per bestbeforedate Items(oldest
		// date to latest date) sort using java code.

	}

	void applyDiscountOnItems() {
		// Find the list of Items which are expiring in next 2 month apply 40%
		// discount on that Items and update the database.

	}

	Map<Customer, ArrayList<PurchaseOrder>> getOrdersByCustomer() {
		// Returns all customers along with list of purchase Orders placed by
		// him.
		return null;
	}

	void displayDiscountedItemsList() {
		// Show discounted Items list to user

	}

}
