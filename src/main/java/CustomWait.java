import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		waitForPageLoad(10);
		By emailid=By.id("input-emaill");
		//retryingElement(emailid,10).sendKeys("tmsonnada");
		retryingElement(emailid,10,2000).sendKeys("tmsonnada");
		

	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static WebElement retryingElement(By locator,int timeout) 
	{
		WebElement element=null;
		int attempts=0;
		while(attempts<timeout)
		{
			try
			{
			element=getElement(locator);
			break;
		}
			catch(NoSuchElementException e)
			{
				System.out.println("Element is not found in first attempt" +attempts);
				try
				{
				Thread.sleep(500);
				}
				catch(InterruptedException e1)
				{
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		if(element==null)
		{
			try {
			throw new Exception ("element not found");
			}
			catch(Exception e)
			{
				System.out.println("Element not found "+timeout+ "with interval of "+500+"ms");
			}
		}
		return element;
	}
	
	public static WebElement retryingElement(By locator,int timeout,int intervaltime) 
	{
		WebElement element=null;
		int attempts=0;
		while(attempts<timeout)
		{
			try
			{
			element=getElement(locator);
			break;
		}
			catch(NoSuchElementException e)
			{
				System.out.println("Element is not found in first attempt" +attempts);
				try
				{
				Thread.sleep(intervaltime);
				}
				catch(InterruptedException e1)
				{
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		if(element==null)
		{
			try {
			throw new Exception ("element not found");
			}
			catch(Exception e)
			{
				System.out.println("Element not found "+timeout+ "with interval of "+intervaltime+"ms");
			}
		}
		return element;
	}
	public static void waitForPageLoad(int timeout)
	{
		long endtime=System.currentTimeMillis() +timeout;
			while(System.currentTimeMillis()<endtime)
			{
				JavascriptExecutor js=(JavascriptExecutor)driver;
			String state=	js.executeScript("return document.readyState").toString();
			System.out.println(state);
			if(state.equals("complete"))
			{
				break;
			}
			}
	}
}
