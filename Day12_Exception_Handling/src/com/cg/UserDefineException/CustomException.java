package com.cg.UserDefineException;

import java.util.Scanner;

//checked Exception
//create an own exception
@SuppressWarnings("serial")
class NameNotFound extends Exception
{
	
	
	//constructor
	NameNotFound(String name )
	{
		super(name);
	}
}

public class CustomException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str =s.nextLine();
		try
		{
			empname(str);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		s.close();
		
	}

	//declaring an exception
	 static void empname(String str)throws NameNotFound
	 {
		 if(str.isEmpty())
		 {
			 //throwing an exception explicity
			 throw new NameNotFound("Employee-Name is empty");
		 }
		 else
		 {
			 System.out.println("Hellow "+str+",");
		 }
	 }
}
	