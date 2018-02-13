package com.psl.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");

			 con= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root"); 
			System.out.println("connection established...!!");
			
			    /*   PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?)");*/
			       
			      /* pstmt.setInt(1,20);
			       pstmt.setString(2,"abc");
			       pstmt.execute();*/
			       CallableStatement cstmt= con.prepareCall("{call myprocedure(?,?)}");
			       cstmt.setInt(1,20);
			       cstmt.setString(2,"abc");
			      cstmt.execute();
			       
			       System.out.println("data inserted....");
			       
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
