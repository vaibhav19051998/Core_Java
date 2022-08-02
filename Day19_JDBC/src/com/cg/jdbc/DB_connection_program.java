package com.cg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_connection_program {

	public static void main(String[] args)throws SQLException
	{
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL= "jdbc:mysql://127.0.0.1:3306/EMPLOYEE";
		String dbUsername="root";
		String dbpassword="Raut@1452";
		String query="SELECT * FROM EMPLOYEE_DETAILS";
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
		Connection C=DriverManager.getConnection(dbURL, dbUsername, dbpassword);
		Statement S=C.createStatement();
		ResultSet R=S.executeQuery(query);
		while(R.next())
		{
			String EmployeeData="";
			
			// for column
			for(int i=1;i<=2;i++)
			{
				EmployeeData=EmployeeData+" "+R.getString(i);
			}
			System.out.println(EmployeeData);
		}
	}
	catch(SQLException e)
	{
		System.out.println("Invalid URL/ID/Password ");
		e.printStackTrace();
		}
	
	}

}
