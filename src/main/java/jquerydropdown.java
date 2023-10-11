import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquerydropdown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).click();
		Thread.sleep(1000);
		By choices = By.xpath("//ul[@class='select2-results__options']/li");
		selectchoices(choices, "all");
	}

	public static void selectchoices(By locator, String... value) {

		List<WebElement> choices = driver.findElements(locator);
		if (value[0].equalsIgnoreCase("all"))
		{
			for (WebElement e : choices) 
			{
				String text = e.getText();
				// System.out.println(text);
				for (int i = 0; i < value.length; i++)
				{
					if (text.equals(value[i])) 
					{
						e.click();
						break;
					}
				}

			}
		}
		else
		{
			try
			{
				for(WebElement e:choices)
				{
					e.click();
				}
			}
			catch(ElementNotInteractableException e)
			{
				System.out.println("choices are over");
			}
		}
	}
}

