
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwaitex
{
	static WebDriver driver;
	
	public static void main(String[] args)
	{
		driver=new ChromeDriver();
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/login");
		By email=By.xpath("//input[@id='input-email']");
		By pswd=By.xpath("//input[@id='input-password']");
		By login=By.xpath("//input[@value='Login']");
 
		//Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).
			//	pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		//wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys("madhu");
				
		//waitForElementLocatedwithFluentwait(email,10,2).sendKeys("madhu");
		waitForElementvisibilitydwithFluentwait(email,10,2).sendKeys("madhu");
 }
	public static WebElement waitForElementLocatedwithFluentwait(By locator,int timeout,long pollingtime)
	{
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout)).
				pollingEvery(Duration.ofSeconds(pollingtime)).ignoring(NoSuchElementException.class);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForElementvisibilitydwithFluentwait(By locator,int timeout,long pollingtime)
	{
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout)).
				pollingEvery(Duration.ofSeconds(pollingtime)).
				ignoring(NoSuchElementException.class,ElementNotInteractableException.class);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
}