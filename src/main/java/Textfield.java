import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textfield 
{

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/register");
	List<WebElement> el=driver.findElements(By.xpath("//form//input[@type='text' or @type='email' or @type='tel' or @type='password']"));
		System.out.println(el.size());
		for(WebElement e:el)
		{
			e.sendKeys("Testing");
		}
	}

}
