package com.psl.q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
 
    public Connection connectionEstabish()
    {
    	Connection con=null;
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		//System.out.println("Driver Loaded");

			con= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/GroceryShop", "root", "root");
			//System.out.println("connection established...!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
    }
}
