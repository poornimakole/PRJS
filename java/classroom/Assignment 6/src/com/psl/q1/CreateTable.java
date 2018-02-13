package com.psl.q1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		
		String query1="create table movies(movie_id int(10) primary key,movie_name varchar(30),language varchar(20),release_date date)";
		String query2="create table shows(show_id int(10) primary key,movie_id int(10),show_date date)";
		String query3="create table booking(user_name varchar(30),show_id int(10))";
		DbConnect db=new DbConnect();
          Connection con=db.connectionEstabish();
          Statement st;
		try {
			st = con.createStatement();
			st.execute(query1);
  			st.execute(query2);
  			st.execute(query3);
  			System.out.println("tables created...!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  			
	}

}
