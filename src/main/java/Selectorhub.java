import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectorhub {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//By car=By.id("cars");
		//WebElement optv=driver.findElement(car);
		//doselectbyvisibletext(car,"Saab");
		//Thread.sleep(2000);
		//doselectbyindex(car,0);
	//	Thread.sleep(2000);
	//	doselectbyvalue(car,"opel");
		//Select select=new Select(optv);
		//List<WebElement> el=select.getOptions();
		//for(WebElement e:el)
	//	{
		//	String text=e.getText();
		//	if(text.equals("Saab"))
			//{
			//	e.click();
			//	break;
			//}
		//}
	//	doselectbyoptionvalue(car,"Saab");
		//without using Select class
		
		//driver.findElement(car).sendKeys("Opel");
		//without using sendkeys
		//List<WebElement> options=driver
			//	.findElements(By.xpath("//select[@name='cars']/option"));
		////for(WebElement e:options)
		//{
		//String text=e.getText();
		//if(text.equals("Saab"))
	////	{
		//	e.click();
			//break;
		//}
		//}
		doselectbyxpath(By.xpath("//select[@name='cars']/option"),"Saab");

	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static void doselectbyvisibletext(By locator,String text)
	{
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	public static void doselectbyindex(By locator,int index)
	{
		Select sele=new Select(getElement(locator));
		sele.selectByIndex(index);
	}
	public static void doselectbyvalue(By locator,String value)
	{
		Select se=new Select(getElement(locator));
		se.selectByValue(value);
	}
	public static void doselectbyoptionvalue(By locator,String value)
	{
		Select sel=new Select(getElement(locator));
		List<WebElement> optvalue=sel.getOptions();
		for(WebElement e:optvalue)
		{
			String text=e.getText();
			if(text.equals(value))
			{
				e.click();
				break;
			}
		}
	}
	public static void doselectbyxpath(By locator,String val)
	{
		
		List<WebElement> optvalue=driver.findElements(locator);
		for(WebElement e:optvalue)
		{
			String text=e.getText();
			if(text.equals(val))
			{
				e.click();
				break;
			}
		}
	}
}
