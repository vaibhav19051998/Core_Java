package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThirdUnitTestExample 
{
	@DisplayName("Test is successfully implemented")
	@Test
	void function()
	{
		
		System.out.println("My Name is Vaibhav");
		
	}
	@Test
	@Disabled("Not implemented")
	void display()
	{
		System.out.println("Fails");
	}
}
