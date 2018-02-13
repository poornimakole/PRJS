package com.psl.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class JdbcDemo {

	public static void main(String[] args) {
		
		//String query="create table emp(id int(10),name varchar(20))";
		//String query1="insert into emp values(2,'vansh')";

		//String query1="update emp set name='asmi' where id=1";
		String query1="select id,name from emp";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");
			System.out.println("connection established...!!");
			
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		//	st.execute(query1);
		//	int i=st.executeUpdate(query1);
			ResultSet rs=st.executeQuery(query1);
			
			
			rs.absolute(3);
			rs.updateInt(1, 222);
			rs.updateRow();
			 System.out.println(rs.getInt(1)+" "+rs.getString(2));
			/* while(rs.next())
			 {
				 System.out.println(rs.getInt(1)+" "+rs.getString(2));
			 }*/
			//System.out.println("row updated...!!!");
			st.close();
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
