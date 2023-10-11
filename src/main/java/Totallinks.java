import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Totallinks 
{
	//1.Number of links on the page
	//2.print the link text
	//3.
public static WebDriver driver;
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//List<WebElement> el=driver.findElements(By.tagName("a"));
		//System.out.println(el.size());
		//for(WebElement e:el)
	//	{
	//	String text=e.getText();
	//	if(!text.isEmpty())
	//	{
	//	System.out.println(text);
	//	}
		//}
		//other for loop method
		//for(int i=0;i<el.size();i++)
		//{
			//String text=el.get(i).getText();
			//if(!text.isEmpty())
			//{
				//System.out.println(text);
			//}
		//with method
		By link=By.tagName("a");
		List<WebElement> el=getElements(link);
		System.out.println(el.size());
		List<String> linktxt=getlinkText(link);
		System.out.println(linktxt.size());
		System.out.println(linktxt);
		System.out.println(linktxt.contains("Sell"));
		}
	

public static List<WebElement> getElements(By locator)
{
	return driver.findElements(locator);
}

public static List<String> getlinkText(By locator)
{
	List<WebElement> elelist=getElements(locator);
	List<String> linktext=new ArrayList<String>();
	for(WebElement e:elelist)
	{
		String text=e.getText();
		if(!text.isEmpty())
		{
			linktext.add(text);
		}
	}
	return linktext;
}
}