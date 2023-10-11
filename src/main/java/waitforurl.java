import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitforurl {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/login");
		By email=By.xpath("//input[@id='input-email']");
		By pswd=By.xpath("//input[@id='input-password']");
		By login=By.xpath("//input[@value='Login']");
		
		System.out.println(waitForurl(10,"route=account/login"));
	String urlvalue=	waitForUrlToBe(10,"https://opencart.antropy.co.uk/index.php?route=account/login");
		System.out.println(urlvalue);
	}
	public static String waitForurl(int timeout,String urlFraction)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.urlContains(urlFraction)))
		{
			return driver.getCurrentUrl();
		}
		return null;
		
	}
	public static String waitForUrlToBe(int timeout,String urlval)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.urlToBe(urlval)))
		{
			return driver.getCurrentUrl();
		}
		return null;
	}

}
