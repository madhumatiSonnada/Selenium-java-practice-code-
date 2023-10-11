import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait 
{

	static WebDriver driver;
	public static void main(String[] args) 
	{
		//Static wiat
		//Thread.sleep(2000);
		//if element is found withing 1 sec and reamianin 1 sec still it will wait
		/**
		 * 
		 */
		//Dynamic wait
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("madhu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

	}

}
