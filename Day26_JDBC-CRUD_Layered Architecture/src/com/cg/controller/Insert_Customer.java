package com.cg.controller;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class Insert_Customer {

		public static void main(String[] args) throws SQLException {
			String dbURL= "jdbc:mysql://127.0.0.1:3306/EMPLOYEE";
			String dbUsername="root";
			String dbpassword="Raut@1452";
			try
			{
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbpassword);
			String query="INSERT INTO CUSTOMER2(ID,NAME,SALARY)VALUES(?,?,?)";
			PreparedStatement ps=c.prepareStatement(query);
			ps.setInt(1,13);
			ps.setString(2,"john2");
			ps.setFloat(3, 150000);
			
			int r=ps.executeUpdate();
			//if row is greater than zero means at least some rows is there
			if(r>0)
			{
				System.out.println("A new user is inserted succesfully");
				
			}
			c.close();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

	}
