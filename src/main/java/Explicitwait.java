import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait 
{

	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/login");
		By email=By.xpath("//input[@id='input-email']");
		By pswd=By.xpath("//input[@id='input-password']");
		By login=By.xpath("//input[@value='Login']");
		
		//Implicitly wait
		//Explicit wait
			//1.WebDriver wait
			//2.Fluent wait
		
		//WebDriver wait extends Fluent wait and implements wait
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(email));
	//	ele.sendKeys("madhu");
		//waitforElementPresent(email,10).sendKeys("madhu");
		waitforElementToBeVisible(email,10).sendKeys("madhu");
		//WebElement el=wait.until(ExpectedConditions.presenceOfElementLocated(pswd));
		//el.sendKeys("sonnada");
		getElement(pswd).sendKeys("madhu");
		getElement(login).click();
	
		
		
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static WebElement waitforElementPresent(By locator,int timeout)
	{
		
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
		
	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page and 
	 * visible.Visibility means that the element is not only displayed but also has a 
	 * height and width that isgreater than 0.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement waitforElementToBeVisible(By locator,int timeout)
	{
		
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
		}
	
	
}
