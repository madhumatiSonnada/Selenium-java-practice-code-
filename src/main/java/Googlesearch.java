import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Googlesearch {

	 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\owner\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions co=new ChromeOptions();
		//co.setBinary("C:\\Users\\owner\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Naveen automation Labs");
		Thread.sleep(2000);
		//**//
		////List<WebElement> ele=driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']//span"));
	//	for(WebElement e:ele)
		//{Z
			//String text=e.getText();
			//System.out.println(text);
			//if(text.contains("api testing"))
			//{
				//e.click();
				//break;
		//	}
	//	}
		By searchpath=By.xpath("//ul[@role=\"listbox\"]/li//div[@class='wM6W7d']//span");
		searchlist(searchpath,"interview questions");
	}
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	public static void searchlist(By locator,String value)
	{
	List<WebElement> searchlist=getElements(locator);
	for(WebElement e:searchlist)
	{
		String text=e.getText();
		System.out.println(text);
		if(text.contains(value))
		{
			e.click();
			break;
		}
	}
	}
}
