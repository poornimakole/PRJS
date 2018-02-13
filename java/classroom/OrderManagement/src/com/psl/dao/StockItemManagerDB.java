package com.psl.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.psl.beans.StockItem;
import com.psl.beans.Units;

public class StockItemManagerDB {

	void insertStockItems(ArrayList stockItemlist) {
		// Inserts Stock Items details into data base
	}

	public ArrayList<StockItem> getStockItems() {
		// Return StockItems List

		DBConnenctionManager dbcm = new DBConnenctionManager();
		Connection con = dbcm.getDBConnection("root", "root", "root");

		ArrayList<StockItem> stocklist = new ArrayList<StockItem>();
		
		
		String str = "select * from stockItem_details";

		try {
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(str);

			while (set.next()) {
				/*System.out.println(set.getInt(1) + " " + set.getString(2) + " "
						+ set.getString(3) + " " + set.getString(4) + " "
						+ set.getInt(5) + " " + set.getDate(6) + " "
						+ set.getDate(7));*/
				StockItem si = new StockItem();
				si.setId(set.getInt(1));
				si.setName(set.getString(2));
				si.setDescription(set.getString(3));
				si.setUnit(Units.valueOf(set.getString(4)));
				si.setPrice(set.getFloat(5));
				si.setMfg_date(set.getDate(6));
				si.setBest_before_dt(set.getDate(7));
			
				stocklist.add(si);
				
				
			}
			
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return stocklist;
	}

	void deleteStockItems(int no) {
		// delete stockItems
	}

}
