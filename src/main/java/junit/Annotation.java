package junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Annotation {
	
	@BeforeEach
	public void beforejunit1()
	{
		System.out.println("before junit");

		
	}

	
	@Test
	public void junit1()
	{
		System.out.println("inside junit");
		
		
	}
	@AfterEach
	public void afterjunit1()
	{
		System.out.println("after junit");

		
	}

}
