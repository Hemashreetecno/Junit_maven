package Junit.Junit_maven;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
@ExtendWith(EnvExtension.class)

public class ExtensionTest {
	@Test
	public void junit1()
	{
		assertTrue(StringFunction.isPalindrome("radar"));
		System.out.println("inside test");
	}

}
