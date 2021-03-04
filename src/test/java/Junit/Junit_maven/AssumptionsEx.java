package Junit.Junit_maven;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

public class AssumptionsEx {
	
	@DisplayName("assumptions Ex")
	@Test
	public void junit1()
	{
		System.setProperty("ENV", "DEV");
		assumeTrue("DEV",equals(System.getProperty("ENV")));
		//assertTrue(true);
		assertEquals(30,calculator.add(10, 20));

	
	}
}
