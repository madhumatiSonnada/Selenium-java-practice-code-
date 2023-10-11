import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept 
{
	
	public static void main(String[] args) 
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver	driver=new ChromeDriver();
		driver.get("http://opencart.antropy.co.uk/index.php?route=account/login");
		//1st Approach
	//	driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
	//	driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		
		//2nd approach
		
		//WebElement Email=driver.findElement(By.id("input-email"));
		//WebElement pass=driver.findElement(By.id("input-password"));

		//Email.sendKeys("naveen@gmail.com");
	//	pass.sendKeys("test@123");
		
		//3rd approach
		//By mail=By.id("input-email");
		//By ps=By.id("input-password");
		//driver.findElement(mail).sendKeys("naveen@gmail.com");
		//driver.findElement(ps).sendKeys("test@123");
		//OR
		//WebElement EMAIL=driver.findElement(mail);
		//WebElement PASS=driver.findElement(ps);
		//EMAIL.sendKeys("input-email");
		//PASS.sendKeys("input-password");
		
		//4th approach
		//By mail=By.id("input-email");
		//By ps=By.id("input-password");
		//getElement(mail).sendKeys("naveen@gmail.com");
		//getElement(ps).sendKeys("test@123");
		//5th approach--create dosendkeys method
	//	By mail=By.id("input-email");
		//By ps=By.id("input-password");
	//	dosendKeys(mail,"naveen@gmail.com");
		//dosendKeys(ps,"test@123");
		//6th approach
		By mail=By.id("input-email");
		By ps=By.id("input-password");
		ElementUtil util=new ElementUtil(driver);
		util.dosendKeys(mail, "naveen@gmail.com");
		util.dosendKeys(ps, "test@123");
		
	}
	//public static WebElement getElement(By locator)
	//{
		//return driver.findElement(locator);
	//}
	//public static void dosendKeys(By locator,String value)
	//{
		//getElement(locator).sendKeys(value);
	//}

}
