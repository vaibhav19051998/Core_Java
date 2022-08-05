package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUpdate {

	public static void main(String[] args) {
		String dbURL= "jdbc:mysql://127.0.0.1:3306/EMPLOYEE";
		String dbUsername="root";
		String dbpassword="Raut@1452";
		try
		{
		Connection c=DriverManager.getConnection(dbURL, dbUsername, dbpassword);
		String query="UPDATE CUSTOMER SET NAME=?,EMAIL_ID=? WHERE ID=?";
		PreparedStatement ps=c.prepareStatement(query);

		ps.setString(1,"JHONY");
		ps.setString(2,"JHONY@gmail.com");
		ps.setInt(3, 15);
	
		int r=ps.executeUpdate();
		//if row is greater than zero means at least some rows is there
		if(r>0)
		{
			System.out.println("A new user is updated succesfully");
			
		}
		c.close();
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	}

}
