package com.psl.demo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.crypto.Data;

public class BatchUpdateDemo {

	public static void main(String[] args) {
		
		
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");

			 con= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root"); 
			System.out.println("connection established...!!");
			
			   Statement st=con.createStatement();
			     st.addBatch("insert into emp values(1,'asmi')");
			     st.addBatch("insert into emp values(2,'sita')");
			     st.addBatch("insert into emp values(3,'veda')");
			     st.addBatch("insert into emp values(4,'vansh')");
			     st.addBatch("insert into emp values(5,'ram')");
			     int i[]=st.executeBatch();
			     for (int j = 0; j < i.length; j++) {
					System.out.println(i[j]);
				}
			     
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

