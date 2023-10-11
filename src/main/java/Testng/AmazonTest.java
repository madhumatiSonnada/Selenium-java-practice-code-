package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest 
{
	 WebDriver driver;
	@BeforeTest
	public void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		
	}
	
	@Test(description = "Verifying title")
	public void titleTest()
	{
	String title=	driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}
	@Test(enabled = false)
	public void urlTest()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("Amazon"));
	}
	@Test
	public void searchTest()
	{
		Boolean flag=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
