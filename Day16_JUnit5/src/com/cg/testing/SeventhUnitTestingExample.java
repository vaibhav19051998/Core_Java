package com.cg.testing;
//Problem on AssumingThat 
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

public class SeventhUnitTestingExample 
{
	@Test
	void assumptionThat()
	{
		
		String str="vaibhav";
		assumingThat(str.equals("Vaibhav"),
				()->assertEquals(2+3,5));
	}
}
