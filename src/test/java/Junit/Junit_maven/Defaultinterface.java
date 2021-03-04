package Junit.Junit_maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public interface Defaultinterface {

	
	@Test
	default void testPalindrome()
	{
		boolean flag =StringFunction.isPalindrome("radar1");
		assertTrue(flag);
		System.out.println("inside interface");
		
		
	}
}