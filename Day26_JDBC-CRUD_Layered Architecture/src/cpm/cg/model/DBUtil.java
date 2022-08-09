package cpm.cg.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static void main(String[] args) {
		String dbURL= "jdbc:mysql://127.0.0.1:3306/EMPLOYEE";
		String dbUsername="root";
		String dbpassword="Raut@1452";
		try
		{
			//to check whether the eclipse is connected either MYSQL or not 
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbpassword);
			if(c!=null)
			{
				System.out.println("connected ");
				c.close();	
			}
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
		
		
	}
