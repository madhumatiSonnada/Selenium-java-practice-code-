package Testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Priority
{
	WebDriver driver;
@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/login");
	}
	@Test(priority=1)
	public void titleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		AssertJUnit.assertEquals(title, "Account Login");
	}
	@Test(priority=0)
	public void urlTest()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		AssertJUnit.assertTrue(url.contains("login"));
	}
	@Test(priority=-1)
	public void searchTest()
	{
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/login");
		AssertJUnit.assertTrue(driver.findElement(By.name("search")).isDisplayed());
	}
	@Test(priority='a')
	public void atest()
	{
		System.out.println("Testing a");
	}
	@Test(priority='b')
	public void btest()
	{
		System.out.println("Test b");
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
