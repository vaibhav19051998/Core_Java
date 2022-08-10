package com.cg.exception;

public class ThrowKeyword 
{
	public static void validate(int age)
	{
		if(age<21 || age>27)
			throw new ArithmeticException("not eligible");
		else
			System.out.println("Eligible to attend military selection");
	}
	
	public static void main(String[] args) {
		try 
		{
			validate(30); 
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("rest of the code.....");
		}
	}

}
