package Testng;

import org.testng.annotations.Test;

public class DependsofmethodTest {

	@Test
	public void loginTest()
	{
		System.out.println("Logged in");
		
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homepageTest()
	{
		System.out.println("homepage test");
		//int i=9/0;
	}
	@Test(dependsOnMethods = {"homepageTest","loginTest"})
	public void searchTest()
	{
		System.out.println("search test");
	}
	
}
