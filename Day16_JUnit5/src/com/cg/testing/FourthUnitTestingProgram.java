package com.cg.testing;

//Program on Assertions

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FourthUnitTestingProgram 
{
	@Test
	void display()
	{
		int a[]= {4,15,18,50};
		assertAll("a",()->assertEquals(a[1],15),()->assertEquals(a[3],50));
		
	}
}
