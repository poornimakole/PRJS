package com.psl.q1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		
		String query1="create table emp( EMPNO int(10) not null,ENAME VARCHAR(10),JOB  VARCHAR(9), MGR   int(4), HIREDATE  DATE, SAL decimal(7,2),COMM decimal(7,2), DEPTNO  int(2))"; 

		
		DbConnect db=new DbConnect();
          Connection con=db.connectionEstabish();
          Statement st;
		try {
			st = con.createStatement();
			st.execute(query1);
  			System.out.println("tables created...!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  			
	}

}
