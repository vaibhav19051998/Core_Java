package com.cg.testing;
//Problem on  false Assumption

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;

import org.junit.jupiter.api.Test;

public class SixthUnitTestingExample 
{
	@Test
	
	void falseAssumption()
	{
		
		assumeFalse(1>8);
		assertEquals(10+2,10);
	}

}
