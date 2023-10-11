import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googlesearchdropdown 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromiumdriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Naveen Automation Lab");
		Thread.sleep(2000);
		By suggestions=By.xpath("//ul[@role=\"listbox\"]/li//div[@class='wM6W7d']//span");
		getSuggestion(suggestions,"interview questions");
		

	}
	public static List<WebElement> getElements(By locator){

		 return driver.findElements(locator);
}
	public static void getSuggestion(By locator,String searchtext)
	{
		List<WebElement> suggestion=getElements(locator);
		for(WebElement e:suggestion)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.contains(searchtext))
			{
				e.click();
				break;
			}
		}
	}
}