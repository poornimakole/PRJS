package com.psl.demo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseMetaDataDemo {
	public static void main(String[] args) {
		
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");

			 con= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root"); 
			System.out.println("connection established...!!");	   
			
			DatabaseMetaData db =con.getMetaData();
			System.out.println(db.getDatabaseProductName());
			System.out.println(db.getDatabaseMinorVersion());
			System.out.println(db.getDatabaseMajorVersion());
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp");
			ResultSetMetaData rsmd=rs.getMetaData();
			 
			System.out.println(rsmd.getTableName(1));
			
			int c=rsmd.getColumnCount();
			System.out.println(c);
			for (int j =1; j <= c; j++) {
				System.out.println(rsmd.getColumnName(j)+" : "+rsmd.getColumnTypeName(j));
				
			}
			
			/*ResultSet rs=db.getTables(null,null,null,null);
			
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			*/
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
