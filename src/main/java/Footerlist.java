import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footerlist 
{

	static WebDriver driver;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By footerlist=By.xpath("//ul[@class='sc-ace17a57-0 sc-4f15dcd9-0 kTjuIu gkmXaP']//a");
		List<String> footer=getfooterlist(footerlist);
		for(String s:footer)
		{
			System.out.println(s);
			
		}
	}
	public static List<String> getfooterlist(By locator)
	{
		List<WebElement> footerlist=driver.findElements(locator);
		List<String> list=new ArrayList<String>();
		for(WebElement e:footerlist)
		{
			String text=e.getText();
			list.add(text);
		}
		return list;
	}

}
