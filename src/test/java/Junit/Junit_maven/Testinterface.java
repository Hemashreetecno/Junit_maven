package Junit.Junit_maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testinterface implements Defaultinterface
{
	@Test
	public void junit1()
	{
		assertEquals(30,calculator.add(10, 20));
		System.out.println("Inside Testcase");
		
	}

}
