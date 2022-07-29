package com.cg.testing;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class EightUnitTestExample 
{

	@Test
	 void print()
	{
		System.out.println("Hellow Everyone");
	}
	@Test
	@AfterAll
	 static void display()
	{
		System.out.println("@AfterAll-execute once After all the test methods in this class");
	}
	
	@Test
	@AfterEach
	 void accept()
	{
		System.out.println("@AfterEach-execute After each test methods in this class");
	}
}
