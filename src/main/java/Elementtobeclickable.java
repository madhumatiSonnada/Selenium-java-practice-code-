import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elementtobeclickable {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		By locator=By.linkText("Registry");
		By footer=By.linkText("Conditions of Use");
		clickwhenReady(locator,20);
		clickElementwhenReady(footer,50);

	}
	public static void clickwhenReady(By locaor,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locaor)).click();
	}
	public static void clickElementwhenReady(By locator,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(getElement(locator))).click();
		
	}
public static WebElement getElement(By locator)
{
	return driver.findElement(locator);
}
}
