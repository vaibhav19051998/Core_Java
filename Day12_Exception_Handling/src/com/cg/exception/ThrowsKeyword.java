package com.cg.exception;

import java.io.IOException;

public class ThrowsKeyword 
{
	static void display(int x)throws IOException,ClassNotFoundException
	{
		if(x==5)
		{
			//throw keyword is used to throw an exception explicitly
			throw new IOException("inpit-output Exception");
			
		}
		else
		{
			throw new ClassNotFoundException("ClassNotFoundException");
		}
	}
	public static void main(String[] args) {
		try
		{
			display(7);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
