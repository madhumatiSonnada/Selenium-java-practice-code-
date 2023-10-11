import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforElements 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By locator=By.xpath("//ul[@class='sc-ace17a57-0 sc-4f15dcd9-0 kTjuIu gkmXaP']//a");
		//printAllText(locator,10);
		System.out.println(getElementtextwithwait(locator,10));
	}

	public static List<WebElement> waitforElements(By locator,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public static void printAllText(By locator,int timeout)
	{
	List<WebElement> list=	waitforElements(locator,timeout);
	for(WebElement e:list)
	{
		String text=e.getText();
		System.out.println(text);
	}
	}
	public static List<String> getElementtextwithwait(By locator,int timeout)
	{
		List<WebElement> list=	waitforElements(locator,timeout);
		List<String> footerlist=new ArrayList<String>();
		for(WebElement e:list)
		{
			String text=e.getText();
			footerlist.add(text);
		}
		return footerlist;
	}
}
