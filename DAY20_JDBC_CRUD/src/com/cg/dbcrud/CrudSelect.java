package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudSelect {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String dbURL= "jdbc:mysql://127.0.0.1:3306/EMPLOYEE";
		String dbUsername="root";
		String dbpassword="Raut@1452";
		try
		{
		Connection c=DriverManager.getConnection(dbURL, dbUsername, dbpassword);
		String query="SELECT * FROM CUSTOMER";
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery(query);
		//int count=0;
		while(r.next())
		{
			int id=r.getInt(1);
			String name=r.getString(2);
			String email=r.getString(3);
			String password=r.getString(4);
			
			String output="Emp.Id:%d %s %s %s";
			System.out.println("String.format(output,id,name,email,password)");
		
		}
		c.close();
	
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}

  }
}

