package Testng;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept 
{
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void LoginTest()
	{
		System.out.println("Login test");
		int i=9/0;
		
	
	}

}
