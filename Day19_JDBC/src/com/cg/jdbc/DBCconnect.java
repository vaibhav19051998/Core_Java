package com.cg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCconnect {

	public static void main(String[] args) throws SQLException {
		String dbDriver="com.mysql.cj.jdbc.Driver";
		// to connect eclipse with mysql server
		String dbURL= "jdbc:mysql://127.0.0.1//3306/student";
		String dbUsername="root";
		String dbpassword="Raut@1425";
		String query="SELECT*FROM student_data";
		// if any exception will occur in driver class that will handle by using catch block
		//if call name of the driver is incorrect, then it will throw an exception
		try
		{
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
		Connection c=DriverManager.getConnection(dbURL, dbUsername, dbpassword);
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery(query);
		
		while(r.next())
		{
			String data="";
			
			// for column
			for(int i=1;i<1;i++)
			{
				data=data+" "+r.getString(i);
			}
			System.out.println(data);
		}
		
	}
	catch(SQLException e)
	{
		System.out.println("Invalid URL/ID/Password ");
		e.printStackTrace();
	}

}
}
