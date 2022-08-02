package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudDelete {

	public static void main(String[] args) {
		String dbURL= "jdbc:mysql://127.0.0.1:3306/EMPLOYEE";
		String dbUsername="root";
		String dbpassword="Raut@1452";
		try
		{
		Connection c=DriverManager.getConnection(dbURL, dbUsername, dbpassword);
		String query="DELETE FROM CUSTOMER WHERE ID=? ";
		PreparedStatement ps=c.prepareStatement(query);
		
		ps.setInt(1, 11);
	
		int r=ps.executeUpdate();
		//if row is greater than zero means atleast some rows is there
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
