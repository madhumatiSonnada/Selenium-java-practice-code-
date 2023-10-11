import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriverwaitwithpolling
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		driver=new ChromeDriver();
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/login");
		By email=By.xpath("//input[@id='input-email']");
		By pswd=By.xpath("//input[@id='input-password']");
		By login=By.xpath("//input[@value='Login']");
		waitforElementPresent(email,10,2000).sendKeys("madhu");
		waitForVisibilityofElement(pswd,10,2000).sendKeys("mati");
	}
	public static WebElement waitforElementPresent(By locator,int timeout,long pollingtime)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout),Duration.ofMillis(pollingtime));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static WebElement waitForVisibilityofElement(By locator,int timeout,long pollingtime)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout),Duration.ofMillis(pollingtime));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	
}
