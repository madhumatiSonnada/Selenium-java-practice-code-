import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleElementException 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/login");
		By email=By.xpath("//input[@id='input-email']");
		By pswd=By.xpath("//input[@id='input-password']");
		By login=By.xpath("//input[@value='Login']");
 
		WebElement email_login=driver.findElement(email);
		email_login.sendKeys("madhu");
		driver.navigate().refresh();
		email_login=driver.findElement(email);
		email_login.sendKeys("sonnada");//StaleElementReferenceException
		
		
	}

}
