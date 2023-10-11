package Testng;

import org.testng.annotations.Test;

public class Invocationconcept 
{
	@Test(invocationCount = 10,priority=1)
	public void loginTest()
	{
		System.out.println("Login test");
	}
	@Test(invocationCount = 2,priority=2)
	public void homepageTest()
	{
		System.out.println("Home page");
	}
}
