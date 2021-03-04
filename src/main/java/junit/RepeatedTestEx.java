package junit;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestEx {
	
	@DisplayName("examplle")
	@RepeatedTest(4)
	public void junit1()
	{
		System.out.println("inside");
	}

}
