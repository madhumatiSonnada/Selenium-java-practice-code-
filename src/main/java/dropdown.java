import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		 WebElement country= driver.findElement(By.id("Form_getForm_Country"));
		 Select select=new Select(country);
		 System.out.println(select.isMultiple());
		 select.selectByIndex(5);
		 select.selectByValue("India");
		 
		//By Country = By.id("Form_getForm_Country");
		//doSelectByValue(Country,"India");
		//doSelectByIndex(Country,3);
		
	}

	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public void doSelectByVisibleText(By locator, String text) 
	{

		Select select=new Select(getElement(locator));

			select.selectByVisibleText(text);
	}

	public static void doSelectByIndex(By locator, int index) 
	{
		Select select=new Select(getElement(locator));

		 select.selectByIndex(index);

	}

	public static void doSelectByValue(By locator, String value) 
	{

			 Select select=new Select(getElement(locator));

			 select.selectByValue(value);

}

}
