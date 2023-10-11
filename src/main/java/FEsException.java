import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FEsException
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		
	driver=new ChromeDriver();
	driver.get("https://www.freshworks.com/");
	//driver.findElement(By.linkText("Customer")).click();
	//NoSuchElementException
	//List<WebElement> footer= driver.findElements(By.xpath("//ul[@class='sc1-ace17a57-0 sc-4f15dcd9-0 kTjuIu gkmXaP']//a"));
//	System.out.println(footer.size());//findelements xpath is wrong then it will retrn emplty list so size will be 0
	System.out.println(isElementpresent(By.xpath("//ul[@class='sc-ace17a57-0 sc-4f15dcd9-0 kTjuIu gkmXaP']//a")));
	//List<WebElement> footer= driver.findElements(By.xpath("//@@@@@ul[@class='sc1-ace17a57-0 sc-4f15dcd9-0 kTjuIu gkmXaP']//a"));
	//System.out.println(footer.size());//InvalidSelectorException
	}
public static boolean isElementpresent(By locator)
{
	if(getElements(locator).size()>0)
	{
		return true;
	}
	return false;
}
public static List<WebElement> getElements(By locator)
{
	return driver.findElements(locator);
}
}
