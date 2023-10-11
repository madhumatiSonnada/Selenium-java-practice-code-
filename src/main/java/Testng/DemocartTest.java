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

public class DemocartTest extends BaseTest
{
	//WebDriver driver;
/*	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/login");
	}*/
	@Test(priority=3)
	public void titleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login");
	}
	@Test(priority=2)
	public void urlTest()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("login"));
	}
	@Test(priority=1)
	public void searchTest()
	{
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/login");
		Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
	}
	/*@AfterTest
	public void teardown()
	{
		driver.quit();
	}*/
}
