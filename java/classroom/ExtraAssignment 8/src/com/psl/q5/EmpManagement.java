package com.psl.q5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpManagement {

	public EmpManagement() {
		// TODO Auto-generated constructor stub
	}

	public void addEmp(int e,String n,String a,String c,int s) 
	{
		// TODO Auto-generated method stub
		 DbConnect db=new DbConnect();
		 Connection con=db.connectionEstabish();
		 try {
			Statement st=con.createStatement();
			st.execute("insert into empidbi values("+e+",'"+n+"','"+a+"','"+c+"',"+s+")");
			System.out.println("data inserted.....");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		 DbConnect db=new DbConnect();
		 Connection con=db.connectionEstabish();
		 try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from empidbi");
   
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void searchEmp(int empid) {
		// TODO Auto-generated method stub
		DbConnect db=new DbConnect();
		 Connection con=db.connectionEstabish();
		 try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from empidbi where empid="+empid);
  
			if(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
			}
			else
			{
				System.out.println("Employee does not exist");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
}
