package com.cg.testing;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SecondUnitTestingExample 
{
	@Test
	 void print()
	{
		System.out.println("Hellow Everyone");
	}
	@Test
	@BeforeAll

	 static void display()
	{
		System.out.println("@BeforeAll-execute once before all the test methods in this class");
	}
	
	@Test
	@BeforeEach
	 void accept()
	{
		System.out.println("@BeforeEach-execute before each test methods in this class");
	}
}
