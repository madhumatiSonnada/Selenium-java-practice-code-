import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAttribute 
{

	static WebDriver driver;
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//String hreflink=driver.findElement(By.linkText("Sell")).getAttribute("href");
		//System.out.println(hreflink);
		By atr=By.tagName("a");
	getAttribute(atr,"href");
		//getAttribute(atr,"src");
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
		
	}
	public static List<String> getAttribute(By locator,String atrname)
	{
		List<WebElement> el=getElements(locator);
		List<String> atrlist=new ArrayList<String>();
		for(WebElement e:el)
		{
			String atrvalue=e.getAttribute(atrname);
			System.out.println(atrvalue);
			atrlist.add(atrvalue);
		}
		return atrlist;
		
	}
}
