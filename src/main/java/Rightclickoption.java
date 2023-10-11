import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclickoption 
{

	static WebDriver driver;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		// WebElement
		// rightclickbtn=driver.findElement(By.xpath("//span[@class='context-menu-one
		// btn btn-neutral']"));
		// Actions ac=new Actions(driver);
		// ac.contextClick(rightclickbtn).perform();
		By rightclickbtn = By.xpath("//span[@class='context-menu-one btn btn-neutral']");
		By rightclickoptions = By.xpath("//ul[@class='context-menu-list context-menu-root']//span");
		// docontextclick(rightclickbtn);
		//getrightclickoptions(rightclickbtn, rightclickoptions);
		//System.out.println(getrightclickoptionscount(rightclickbtn,rightclickoptions));
		contextclickvalue(rightclickbtn,rightclickoptions,"Paste");
	}

	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) 
	{
		return driver.findElements(locator);
	}

	// Right click /Context click utility
	public static void docontextclick(By locator)
	{
		Actions ac = new Actions(driver);
		ac.contextClick(getElement(locator)).perform();
	}
	
	//count
	public static int getrightclickoptionscount(By rightclick,By rightclickoptions)
	{
	return getrightclickoptions(rightclick,rightclickoptions).size();
	
	}

	// Get rightclickoptions
	public static List<String> getrightclickoptions(By rightclick,By rightclickoptions)
	{
		docontextclick(rightclick);
	List<WebElement> optionslist=getElements(rightclickoptions);
	List<String> optionsitems=new ArrayList<String>();
	for(WebElement e:optionslist)
	{
		String text=e.getText();
		//System.out.println(text);
		optionsitems.add(text);
	}
	return optionsitems;
	}
	//click on option
	public static void contextclickvalue(By rightclick,By options,String value)
	{
		docontextclick(rightclick);
		List<WebElement> items=getElements(options);
		for(WebElement e:items)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.equals(value))
			{
				e.click();
				break;
			}
		}
		
	}
	
}
