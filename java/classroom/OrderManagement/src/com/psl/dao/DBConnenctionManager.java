package com.psl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnenctionManager implements ConnectionManager {

	Connection con = null;
	@Override
	public Connection getDBConnection(String url, String user, String pwd) {
		// TODO Auto-generated method stub
		
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Loaded");

				 con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/OrderManagementDB", "root", "root");
				System.out.println("Connected");
				return con;
			} catch (SQLException e) {
				e.printStackTrace();
			}

			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			return null;
		}
		
		
	

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
