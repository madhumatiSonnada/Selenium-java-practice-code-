import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionssendkeyandclick
{
	static WebDriver driver;
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/login");
		
		By email=By.id("input-email");
		By pass=By.id("input-password");
		By login=By.xpath("//input[@value='Login']");
		//Actions ac=new Actions(driver);
		//ac.sendKeys(driver.findElement(email),"naveen@gmail.com").perform();
		//ac.sendKeys(driver.findElement(pass), "naveen").perform();
		//ac.click(driver.findElement(login)).perform();
		doActionssendkey(email,"naveen@gmail.com");
		doActionssendkey(pass,"naveen");
		doActionsclick(login);
		

	}
	public static void doActionssendkey(By locator,String value)
	{
		Actions ac=new Actions(driver);
		ac.sendKeys(driver.findElement(locator),value).perform();
		
	}
	public static void doActionsclick(By locator)
	{
		Actions ac1=new Actions(driver);
		ac1.click(driver.findElement(locator)).perform();
	}

}
