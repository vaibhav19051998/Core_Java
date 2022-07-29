package com.cg.testing;
//Program on True AssumTrue
import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;
import org.junit.jupiter.api.Test;

public class FifthUnitTestingExample 
{
	@Test
	void trueAssumption()
	{
		//assumeTrue says that if your assumption & result both are true then it will execute otherwise not 
		assumeTrue(15>8);
		assertEquals(10+2,12);
	}
	
}
